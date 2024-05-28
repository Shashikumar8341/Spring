package com.src.dao;

public class Address {
	private int id;
	private String name;
	private Employee employee;

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public void display() {
		System.out.println("Eid : " + id + " Ename : " + name);
		employee.display();
	}

}
