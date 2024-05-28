package com.src.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.src.dao.AddressDao;
import com.src.dto.Address;
public class AddressService {
	@Autowired
	private AddressDao addressDao;

	public void save(Address address) {
		System.out.println("it atached with the AddressService");
		addressDao.save(address);
	}
}
