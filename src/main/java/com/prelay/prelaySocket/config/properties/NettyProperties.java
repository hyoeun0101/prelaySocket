package com.prelay.prelaySocket.config.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.ConstructorBinding;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@ConfigurationProperties(prefix="prelayserver.config")
public class NettyProperties {
	private int port;
    private boolean enable;
//    private BCoupon bCoupon;
    
//    @Getter
//    @RequiredArgsConstructor
//    public  static class BCoupon {
//    	private  int port;
//    	private final boolean enable;
//    }
	
//    private int timeOut;
//    
//    private boolean bCouponEnable;
//
//    private int apiConnectionTimeout;
//
//    private int apiReadTimeout;
//
//    private int readerIdleTime;
//
//    private int writerIdleTime;
//
//    private int so_backLog = 400; //동시에 수용 가능한 클라이언트의 연결 요청 수
//
//    private int so_recvBuf = 1024 * 128;
//
//    private boolean so_tcpNoDelay = true;
//    
//    private boolean so_keepAlive = true; 
    

}
