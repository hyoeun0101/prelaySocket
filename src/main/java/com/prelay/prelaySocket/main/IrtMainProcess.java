package com.prelay.prelaySocket.main;

import org.springframework.stereotype.Component;

import com.prelay.prelaySocket.service.CommonService;
import com.prelay.prelaySocket.utils.StringUtils;

import io.netty.channel.ChannelHandlerContext;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@RequiredArgsConstructor
public class IrtMainProcess implements IMainProcess {
	private final static int MSG_LEN = 4;
	
	private final CommonService commonService;
	

	@Override
	public byte[] start(ChannelHandlerContext ctx, byte[] inData) {
		log.debug("IRT : inData : [{}]", new String(inData));
		
		try {
			checkMsgLen(inData);
			
			long sysTraceNo = commonService.createSysTraceNo();
			
			
			
			
		} catch(Exception e) {
			
		}
		// TODO Auto-generated method stub
		return null;
	}
	
	public void checkMsgLen(byte[] inData) throws Exception{
		byte[] msgLen = new byte[MSG_LEN];
		System.arraycopy(inData, 0, msgLen, MSG_LEN, MSG_LEN);
		
		String msgLenString = StringUtils.getByteToStringEUC(msgLen);
		int msgLenInt = Integer.parseInt(msgLenString);
		
		if(msgLenInt != 470) {
			log.error("IRT MSG_LEN IS WRONG");
			throw new Exception("전문 길이가 잘못되었습니다.");
		}
	}

}
