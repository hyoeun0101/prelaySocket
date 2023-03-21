package com.prelay.prelaySocket.netty;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import com.prelay.prelaySocket.config.properties.NettyProperties;
import com.prelay.prelaySocket.netty.handler.NettyRelayServerHandler;

import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j 
@Configuration
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
        }

    }

    private void nettyRelayServerStart() throws Exception {
//    	InetSocketAddress inetSocketAddress = new InetSocketAddress(nettyProperties.getPort());
//    	
//    	ServerBootstrap bootstrap = new ServerBootstrap();
//		bootstrap.group(bossGroup, workerGroup).channel(NioServerSocketChannel.class)
//		.option(ChannelOption.SO_BACKLOG, nettyProperties.getSo_backLog())
//		.option(ChannelOption.SO_RCVBUF, nettyProperties.getSo_recvBuf())
//		.childOption(ChannelOption.SO_KEEPALIVE, nettyProperties.isSo_keepAlive())
//		.childOption(ChannelOption.TCP_NODELAY, nettyProperties.isSo_tcpNoDelay())
//		.childHandler(new ChannelInitializer<SocketChannel>() {
//			@Override
//			protected void initChannel(SocketChannel socketChannel) throws Exception {
//				ChannelPipeline channelPipeline = socketChannel.pipeline();
//				channelPipeline.addLast("RelayServerHandler", nettyRelayServerHandler);
//			}
//		});
//		
//		ChannelFuture cf = bootstrap.bind(inetSocketAddress).sync();
//		log.info("Server is started : port {}",inetSocketAddress.getPort());
		log.info("{}",nettyProperties.getPort());
		log.info("{}", nettyProperties.isEnable());

//		log.info("{}",nettyProperties.getTimeOut());



    }

    @PreDestroy
    public void destroy() {
        workerGroup.shutdownGracefully();
        bossGroup.shutdownGracefully();
    }
}
