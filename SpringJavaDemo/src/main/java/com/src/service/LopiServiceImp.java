package com.src.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.src.dao.LopiBill;
import com.src.dao.PhoneBill;

public class LopiServiceImp implements LopiService {
	@Autowired
	private LopiBill lopiBill;
	@Autowired
	private PhoneBill phoneBill;

	@Override
	public void getLopiService() {
		lopiBill.getLopiBill();
		phoneBill.getPhoneBill();
		System.out.println("service bill:356566.00");
	}
}
