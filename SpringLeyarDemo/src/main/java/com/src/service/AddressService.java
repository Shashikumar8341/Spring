package com.src.service;

import com.src.dao.AddressDao;
import com.src.dto.Address;

public class AddressService {

	private AddressDao addressDao;

	public AddressService(AddressDao addressDao) {
		this.addressDao = addressDao;
	}

	public void save(Address address) {
		System.out.println("Employee Service Save method: ");
		addressDao.save(address);
	}

}
