package com.prelay.prelaySocket.utils;

import java.nio.charset.Charset;

public class StringUtils {
	
	public static byte[] getStringToByteEUC(String data) {
		return data.getBytes(Charset.forName("EUC-KR"));
	}
	
	public static String getByteToStringEUC(byte[] data) {
		return new String(data,Charset.forName("EUC-KR"));
	}

}
