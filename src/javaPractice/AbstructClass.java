package javaPractice;

import java.util.Date;

public abstract class AbstructClass {
	private String color="White";
	private boolean filled;
	private java.util.Date dateCreate;
	
	protected AbstructClass() {
		dateCreate=new java.util.Date();
	}
	protected AbstructClass(String color, boolean filled) {
		dateCreate=new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	
	public java.util.Date getDateCreate() {
		return dateCreate;
	}
	public void setDateCreate(java.util.Date dateCreate) {
		this.dateCreate = dateCreate;
	}
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public String toString() {
		return "Created on"+dateCreate+"\n Color"+color+"and Filled"+filled;
	}
	
	public abstract double getArea();
	
	public abstract double getPerimeter();
	
	
}
