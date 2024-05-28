package com.src.dao;

import org.springframework.stereotype.Repository;

import com.src.dto.Address;
@Repository
public class AddressDao {
	public void save(Address address) {
		System.out.println("it provide in addressDao" + address);
	}
}
