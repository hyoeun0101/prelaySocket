package com.prelay.prelaySocket.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InstDat {
	private final String POSINST;
	private final String POSAPPL;
	private final String POSSKIND;
	private final String POSSTX;
	private final String POSRKIND;
	private final String POSRTX;
	private final String SKIND;
	private final String STX;
	private final String RKIND;
	private final String RTX;
	private final String TRCODE;
	

	public InstDat(String pOSINST, String pOSAPPL, String pOSSKIND, String pOSSTX, String pOSRKIND, String pOSRTX,
			String sKIND, String sTX, String rKIND, String rTX, String tRCODE) {
		POSINST = pOSINST;
		POSAPPL = pOSAPPL;
		POSSKIND = pOSSKIND;
		POSSTX = pOSSTX;
		POSRKIND = pOSRKIND;
		POSRTX = pOSRTX;
		SKIND = sKIND;
		STX = sTX;
		RKIND = rKIND;
		RTX = rTX;
		TRCODE = tRCODE;
	}	

	
	
	

}
