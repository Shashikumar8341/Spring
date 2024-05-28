package com.src.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.src.dao.AddressDao;
import com.src.dto.Address;

@Service
public class AddressServiceImp implements AddressService {
	@Autowired
	@Qualifier("ContractAddressDaoImp")
	public AddressDao addressDao;

	@Override
	public void save(Address address) {
		System.out.println("it make provide ");
	}

}
