package com.ac.rg.service;

import java.util.List;

import com.ac.rg.entity.TestEntity;

public interface TestServie {
	
	public TestEntity saveData(TestEntity entity);
	public List<TestEntity> getData();
	public TestEntity updateData(long id ,TestEntity update);
	public String deleteData(long id);

}
