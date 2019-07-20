package com.anglia.li.bean;

import java.io.Serializable;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class User implements Serializable{
	
	private static final long serialVersionUID = 300208451285664779L;
	
	@NotNull
	public String name;
	
	@Min(1)
	public int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
