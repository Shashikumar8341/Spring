package com.src.service;

import org.springframework.stereotype.Service;

import com.src.dto.Address;
@Service
public interface AddressService {

	public void save(Address address);
}
