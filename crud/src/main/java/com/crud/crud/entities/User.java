package com.crud.crud.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String name;
	private String branch;
	private String phone;
	private String age;
	private String city;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(long id, String name, String branch, String phone, String age, String city) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.phone = phone;
		this.age = age;
		this.city = city;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", branch=" + branch + ", phone=" + phone + ", age=" + age
				+ ", city=" + city + "]";
	}
	
	
}
