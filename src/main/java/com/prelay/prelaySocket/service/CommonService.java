package com.prelay.prelaySocket.service;

import org.springframework.stereotype.Service;

import com.prelay.prelaySocket.mapper.RoCommonMapper;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class CommonService {
	private final RoCommonMapper roCommonMapper;
	
	public long createSysTraceNo() throws Exception{
		
		long glSerial = (long)roCommonMapper.getSeqOnline();
		log.debug("createSysTraceNo : {}", glSerial);
		glSerial += 900000000000L;
		return glSerial;
	}

}
