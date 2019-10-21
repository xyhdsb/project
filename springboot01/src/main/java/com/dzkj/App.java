package com.dzkj;

import javax.servlet.Filter;
import javax.servlet.Servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.dzkj.filter.HelloFilter;
import com.dzkj.servlet.LoginServer;


@SpringBootApplication
@ServletComponentScan
public class App {
	public static void main(String[] args) {
		//springboot开机
		SpringApplication.run(App.class, args);
	}
	
	@Bean
	public ServletRegistrationBean<Servlet> get(){
		ServletRegistrationBean<Servlet> bean=new ServletRegistrationBean<Servlet>(new LoginServer());
		bean.addUrlMappings("/LoginServer");
		return bean;
	}
	
	@Bean
	public FilterRegistrationBean<Filter> getfilter(){
		FilterRegistrationBean<Filter> bean=new FilterRegistrationBean<Filter>(new HelloFilter());
		bean.addUrlPatterns("/*");
		return bean;
	}
	
	

}
