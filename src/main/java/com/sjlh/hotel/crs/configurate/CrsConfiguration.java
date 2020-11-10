/**
 *
 */
package com.sjlh.hotel.crs.configurate;

import com.sjlh.hotel.crs.core.CrsOrderService;
import com.sjlh.hotel.crs.core.CrsOrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.module.paramnames.ParameterNamesModule;

/**
 * @author Administrator
 *
 */
@Configuration
public class CrsConfiguration {
	@Bean
	public CrsOrderService getCrsOrderService() {
		return new CrsOrderServiceImpl();
	}

	@Bean
	@Primary
	public ObjectMapper getObjectMapper() {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.registerModule(new Jdk8Module()).registerModule(new JavaTimeModule()).registerModule(new ParameterNamesModule());
		return objectMapper;
	}
}
