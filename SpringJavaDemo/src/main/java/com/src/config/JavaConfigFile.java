package com.src.config;

import org.springframework.context.annotation.Bean;

import com.src.dao.LopiBill;
import com.src.dao.LopiBillImp;
import com.src.dao.PhoneBill;
import com.src.dao.PhoneBillImp;
import com.src.service.LopiService;
import com.src.service.LopiServiceImp;

public class JavaConfigFile {
	@Bean
	public PhoneBill phoneBill() {
		return new PhoneBillImp();

	}

	@Bean
	public LopiBill lopiBill() {
		return new LopiBillImp();
	}
	@Bean
	public LopiService lopiService() {
		return new LopiServiceImp();
	}
}
