package com.springboot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ResourceConfig implements WebMvcConfigurer {
	@Value("${file.uploadDir}") // application.properties에 선언한 파일 저장 위치 설정
	String fileDir;
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/bookmarket/images/**")
		.addResourceLocations("file:///"+fileDir)
		.setCachePeriod(60 * 60 * 24 * 365); // 접근 파일 캐싱 시간
	}

}
