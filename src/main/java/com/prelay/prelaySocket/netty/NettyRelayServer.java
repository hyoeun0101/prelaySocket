package com.prelay.prelaySocket.netty;

import com.prelay.prelaySocket.config.properties.NettyProperties;
import com.prelay.prelaySocket.netty.handler.NettyRelayServerHandler;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.net.InetSocketAddress;

@Slf4j
@Component
@RequiredArgsConstructor
public class NettyRelayServer {

    private final NettyProperties nettyProperties;

    private final NettyRelayServerHandler nettyRelayServerHandler;

    private static final EventLoopGroup bossGroup = new NioEventLoopGroup(1);
    private static final EventLoopGroup workerGroup = new NioEventLoopGroup();

    @PostConstruct
    public void start() {
        //네티 서버 연결
        try {
            nettyRelayServerStart();

        } catch(Exception e) {
            log.error("Exception : {}", e.getMessage());
        }

    }

    private void nettyRelayServerStart() throws Exception {

        // 15011 포트 얻기
        InetSocketAddress inetSocketAddress = new InetSocketAddress(nettyProperties.getPort());

        ServerBootstrap bootstrap = new ServerBootstrap();
        bootstrap.group(bossGroup, workerGroup)
                .channel(NioServerSocketChannel.class)
                .option(ChannelOption.SO_BACKLOG, nettyProperties.getSo_backLog())
                .option(ChannelOption.SO_RCVBUF, nettyProperties.getSo_recvBuf())
                .childOption(ChannelOption.SO_KEEPALIVE, nettyProperties.isSo_keepAlive())
                .childOption(ChannelOption.TCP_NODELAY, nettyProperties.isSo_tcpNoDelay())
                .childHandler(new ChannelInitializer<SocketChannel>() {
                    @Override
                    protected void initChannel(SocketChannel socketChannel) throws Exception {
                        ChannelPipeline channelPipeline = socketChannel.pipeline();
                        channelPipeline.addLast("RelayServerHandler", nettyRelayServerHandler);
                    }
                });

        ChannelFuture fc = bootstrap.bind(inetSocketAddress).sync(); //sync()는 바인딩이 완료될 때까지 대기한다.
        log.info("Server is Started : port {}", inetSocketAddress.getPort());
        log.info("Server is Started : port {}", inetSocketAddress);



    }

    @PreDestroy
    public void destroy() {
        workerGroup.shutdownGracefully();
        bossGroup.shutdownGracefully();
    }
}
