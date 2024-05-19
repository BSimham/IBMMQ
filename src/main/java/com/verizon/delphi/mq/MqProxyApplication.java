package com.verizon.delphi.mq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.ws.config.annotation.DelegatingWsConfiguration;

@SpringBootApplication
public class MqProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(MqProxyApplication.class, args);
	}
	

}
