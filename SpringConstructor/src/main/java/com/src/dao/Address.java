package com.src.dao;

public class Address {
	private int id;
	private String name;
	private Employe employee;

	public Address(int id, String name, Employe employee) {
		super();
		this.id = id;
		this.name = name;
		this.employee = employee;
	}

	public void display() {
		System.out.println("Eid : " + id + " Ename : " + name);
		employee.display();
	}
}
