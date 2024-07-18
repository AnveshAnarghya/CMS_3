package com.ac.rg.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TestEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String address;
	private long mobile;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public TestEntity(long id, String name, String address, long mobile) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.mobile = mobile;
	}
	public TestEntity() {
		super();
	}
	@Override
	public String toString() {
		return "TestEntity [id=" + id + ", name=" + name + ", address=" + address + ", mobile=" + mobile + "]";
	}
	
	
}
