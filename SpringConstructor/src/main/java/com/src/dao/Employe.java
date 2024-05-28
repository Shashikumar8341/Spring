package com.src.dao;

public class Employe {

	private int id;
	private String name;
	
	
	public Employe(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public void display() {
		System.out.println("Eid : " + id + " Ename : " + name);
		
	}
}
