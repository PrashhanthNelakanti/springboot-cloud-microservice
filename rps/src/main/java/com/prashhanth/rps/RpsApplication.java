package com.schwab.rps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableEurekaClient
public class RpsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RpsApplication.class, args);
	}

}
