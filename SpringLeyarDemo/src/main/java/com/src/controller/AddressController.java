package com.src.controller;

import com.src.dto.Address;
import com.src.service.AddressService;

public class AddressController {
	
	private AddressService addressService;

	public void setAddressService(AddressService addressService) {
		this.addressService = addressService;
	}

	public void save(Address address) {
		System.out.println("save the Address");
		addressService.save(address);
	}
}
