package com.prelay.prelaySocket.netty.handler;

import java.net.InetSocketAddress;

import com.prelay.prelaySocket.packet.PacketNavigator;
import io.netty.channel.*;
import org.springframework.stereotype.Component;

import com.prelay.prelaySocket.config.properties.NettyProperties;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import jakarta.annotation.PreDestroy;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@RequiredArgsConstructor
public class NettyRelayServerHandler extends ChannelInboundHandlerAdapter {
    private final PacketNavigator packetNavigator;


}
