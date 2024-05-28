package com.src.dto;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class MetroRedLine implements DisposableBean, InitializingBean {
	private String name;

	public MetroRedLine() {
		System.out.println("very good morning metro public");
	}

	public void setName(String name) {
		System.out.println(" metro World DI happen");
		this.name = name;
	}

	public void dispaly() {
		System.out.println("don't touch the right side glass:" + name);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("we call afterPropertiesSet ");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("we call destroy ");

	}

}
