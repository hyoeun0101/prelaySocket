package com.prelay.prelaySocket.main;

import io.netty.channel.ChannelHandlerContext;

public interface IMainProcess {
    //1. 시작
	byte[] start(ChannelHandlerContext ctx, byte[] inData);
	//2. 전문길이 체크
	//3. 헤더 전문유형 값 세팅
	//4. api 전송 및 응답 값 세팅
	//5. 응답 처리

}
