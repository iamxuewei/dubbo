package com.example.springcloudhistrixdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class SpringcloudHistrixDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudHistrixDashboardApplication.class, args);
	}

}

