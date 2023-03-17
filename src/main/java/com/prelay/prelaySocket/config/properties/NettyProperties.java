package com.prelay.prelaySocket.config.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix="prelayServer.netty.")
public class NettyProperties {
	private int port;
    
    private int bCouponPort;

    private boolean enable;
    
    private boolean bCouponEnable;

    private int apiConnectionTimeout;

    private int apiReadTimeout;

    private int readerIdleTime;

    private int writerIdleTime;

    private int so_backLog = 400; //동시에 수용 가능한 클라이언트의 연결 요청 수

    private int so_recvBuf = 1024 * 128;

    private boolean so_tcpNoDelay = true;
    
    private boolean so_keepAlive = true; 

}
