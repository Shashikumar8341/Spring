package com.src.dto;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class MetroGreenLine {
	private String name;

	public MetroGreenLine() {
		System.out.println("very good morning metro public");
	}

	public void setName(String name) {
		System.out.println(" metro World DI happen");
		this.name = name;
	}

	public void dispaly() {
		System.out.println("don't touch the right side glass:" + name);
	}

	@PostConstruct
	public void init() {
		System.out.println("we use of init method");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("we use of destroy method");
	}
}
