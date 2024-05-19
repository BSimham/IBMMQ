package com.verizon.delphi.mq.config;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ws.config.annotation.DelegatingWsConfiguration;

/**
 * @author REDDYAM Aug 19, 2019
 */
@Configuration
public class SpringAsyncConfig {

	@Bean("executors")
	public ExecutorService executors() {
		return  Executors.newCachedThreadPool();
	}
	
	@Bean
	public DelegatingWsConfiguration delegatingWsConfiguration() {
	     return new DelegatingWsConfiguration();
	}
}
