package com.toures.balon;

import java.lang.invoke.MethodHandles;
import java.util.Objects;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.config.GatewayProperties;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages = { "com.toures.balon", "com.gema.autentication" })

public class TouresBalonApiGatewayApplication {

	@Autowired
	private GatewayProperties props;

	private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

	public static void main(String[] args) {
		SpringApplication.run(TouresBalonApiGatewayApplication.class, args);
	}

	@PostConstruct
	public void init() {
		logger.warn(Objects.toString(props));
	}

}