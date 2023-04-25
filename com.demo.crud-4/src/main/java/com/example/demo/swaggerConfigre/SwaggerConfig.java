package com.example.demo.swaggerConfigre;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.util.Predicates;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Component
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
	public Docket getDocket()
	{
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				
	            .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
	           
	            .build()
	            .apiInfo(this.getApiInfo());
				
	}

	private ApiInfo getApiInfo() {
		// TODO Auto-generated method stub
		return new ApiInfoBuilder().title("mY FIrst Apis")
					.description("My Apois").version("1").build();
	}
	

	

}
