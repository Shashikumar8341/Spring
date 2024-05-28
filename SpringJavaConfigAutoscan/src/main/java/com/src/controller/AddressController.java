package com.src.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.src.dto.Address;
import com.src.service.AddressService;

@Controller
public class AddressController {
	@Autowired
	private AddressService addressService;

	public void save(Address address) {
		System.out.println("it consist together");
		addressService.save(address);
	}
}
