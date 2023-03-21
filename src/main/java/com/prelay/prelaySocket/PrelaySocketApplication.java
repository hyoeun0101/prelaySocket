package com.prelay.prelaySocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.prelay.prelaySocket.config.properties.NettyProperties;

@SpringBootApplication
@EnableConfigurationProperties({NettyProperties.class})
public class PrelaySocketApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrelaySocketApplication.class, args);
	}

}
