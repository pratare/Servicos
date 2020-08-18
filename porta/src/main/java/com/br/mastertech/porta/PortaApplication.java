package com.br.mastertech.porta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;

@SpringBootApplication
@RibbonClients(defaultConfiguration = RibbonConfiguration.class)
public class PortaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortaApplication.class, args);
	}

}
