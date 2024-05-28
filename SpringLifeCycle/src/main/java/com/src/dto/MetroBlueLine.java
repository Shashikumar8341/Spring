package com.src.dto;

public class MetroBlueLine {
	private String name;

	public MetroBlueLine() {
		System.out.println("very good morning metro public");
	}

	public void setName(String name) {
		System.out.println(" metro World DI happen");
		this.name = name;
	}

	public void dispaly() {
		System.out.println("don't touch the right side glass:" + name);
	}

	public void init() {
		System.out.println("we use of init method");
	}

	public void destroy() {
		System.out.println("we use of destroy method");
	}
}
