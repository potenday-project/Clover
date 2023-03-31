package com.clover.habbittracker.global.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig{
	@Bean
	WebMvcConfigurer webMvcConfigurer(){

		return new WebMvcConfigurer() {
			public void addCorsMappings(CorsRegistry registery){
				registery.addMapping("/**")
					.allowedOrigins("*")
					.allowedMethods(
						HttpMethod.GET.name(),
						HttpMethod.POST.name(),
						HttpMethod.DELETE.name(),
						HttpMethod.PUT.name()
					);
			}
		};
	}


}
