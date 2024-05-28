package com.src.dao;

import org.springframework.stereotype.Repository;

@Repository
public class PhoneBillImp implements PhoneBill {

	@Override
	public void getPhoneBill() {
		System.out.println("we need off getphonebill:325999.00");
	}
}
