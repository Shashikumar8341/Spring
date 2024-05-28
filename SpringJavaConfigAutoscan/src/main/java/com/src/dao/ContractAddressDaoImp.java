package com.src.dao;

import org.springframework.stereotype.Repository;

import com.src.dto.Address;

@Repository
public class ContractAddressDaoImp implements AddressDao {

	@Override
	public void save(Address address) {
		System.out.println("implements methods ContractAddressDaoImp:" + address);
	}

}
