package com.prelay.prelaySocket.mapper;

import java.sql.SQLException;

import org.springframework.stereotype.Repository;


@Repository
public interface RoCommonMapper {
	int getSeqOnline() throws SQLException;
	
}
