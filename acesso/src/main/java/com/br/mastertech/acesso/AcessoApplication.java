package com.br.mastertech.acesso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@RibbonClients(defaultConfiguration = RibbonConfiguration.class)
public class AcessoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AcessoApplication.class, args);
	}

}
