package com.example.identityservicebis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@ComponentScan(basePackages = { "com.example.*" })
public class IdentityServiceBisApplication {

	public static void main(String[] args) {
		SpringApplication.run(IdentityServiceBisApplication.class, args);
	}

}
