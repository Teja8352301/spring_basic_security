package com.teja.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages="com.teja")
@EnableWebMvc
public class ContextConfig {
	
	public ContextConfig() {
		System.out.println("Context-Config......");
	}
	
	@Bean
	public ViewResolver viewResolver() {
	  InternalResourceViewResolver irv = new InternalResourceViewResolver();
	  irv.setPrefix("/WEB-INF/view/");
	  irv.setSuffix(".jsp");
	  return irv;
	 }

}
