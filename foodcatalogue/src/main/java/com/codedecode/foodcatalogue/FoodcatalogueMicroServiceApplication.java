package com.codedecode.foodcatalogue;

import com.codedecode.foodcatalogue.config.CorsConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@Import(CorsConfig.class) // Importez la configuration CORS
public class FoodcatalogueMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodcatalogueMicroServiceApplication.class, args);
	}


	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}



}
