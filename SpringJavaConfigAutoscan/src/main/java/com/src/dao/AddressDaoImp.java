package com.src.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.src.dto.Address;

@Repository
@Primary
public class AddressDaoImp implements AddressDao {

	@Override
	public void save(Address address) {
		System.out.println("implements methods:" + address);
	}

}
