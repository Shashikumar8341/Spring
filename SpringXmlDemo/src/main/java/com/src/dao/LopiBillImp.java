package com.src.dao;

import org.springframework.stereotype.Repository;

@Repository
public class LopiBillImp implements LopiBill {

	@Override
	public void getLopiBill() {
		System.out.println("we need getlopibill:899999.00");
	}

}
