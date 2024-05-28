package com.src.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.src.controller.AddressController;
import com.src.dao.AddressDao;
import com.src.service.AddressService;

@Configuration
public class ConfigFile {
	@Bean
	public AddressController addressController() {
		return new AddressController();

	}

	@Bean
	public AddressService addressService() {
		return new AddressService();

	}

	@Bean
	public AddressDao addressDao() {
		return new AddressDao();

	}
}
