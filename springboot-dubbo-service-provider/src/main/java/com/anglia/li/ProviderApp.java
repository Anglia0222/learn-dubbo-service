package com.anglia.li;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//@EnableDubbo
@ImportResource("classpath:dubbo-provider-users.xml")
public class ProviderApp {

	public static void main(String[] args) {
		SpringApplication.run(ProviderApp.class, args);
	}

}
