package com.src.dto;

public class Army {
	private int id;
	private String Soldier;
	private double salar;
	
	
	public Army() {
		super();
	}
	public Army(int id, String soldier, double salar) {
		super();
		this.id = id;
		Soldier = soldier;
		this.salar = salar;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSoldier() {
		return Soldier;
	}
	public void setSoldier(String soldier) {
		Soldier = soldier;
	}
	public double getSalar() {
		return salar;
	}
	public void setSalar(double salar) {
		this.salar = salar;
	}
	@Override
	public String toString() {
		return "Army [id=" + id + ", Soldier=" + Soldier + ", salar=" + salar + "]";
	}
	
}
