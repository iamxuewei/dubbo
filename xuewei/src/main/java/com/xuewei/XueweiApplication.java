package com.xuewei;

import org.apache.catalina.filters.CorsFilter;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@EnableRabbit
@EnableCaching
@EnableAsync
@EnableDiscoveryClient
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@EnableAuthorizationServer
//@EnableResourceServer
public class XueweiApplication {

	public static void main(String[] args) {
		SpringApplication.run(XueweiApplication.class, args);

	}

}
