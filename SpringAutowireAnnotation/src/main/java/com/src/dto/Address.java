package com.src.dto;

public class Address {
	private int id;
	private String name;

	public Address(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", name=" + name + "]";
	}
}
