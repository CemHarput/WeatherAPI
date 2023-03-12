package com.example.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages = {"com.example.demo", "com.example.demo.controller"})
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Bean
	public RestTemplate restTemplate(){
		ObjectMapper objectMapper=new ObjectMapper();
		objectMapper.registerModule(new JavaTimeModule());
		return new RestTemplate();
	}
	@Bean
	public ModelMapper modelMapper(){ return new ModelMapper();	}
	@Bean
	public OpenAPI customOpenAPI(){
		return new OpenAPI().info(new Info());

	}
}
