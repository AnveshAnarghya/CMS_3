package com.ac.rg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ac.rg.entity.TestEntity;
import com.ac.rg.repository.TestRepo;

@Service
public class TestSeriviceImpl implements TestServie {

	@Autowired
	private TestRepo testRepo;

	@Override
	public TestEntity saveData(TestEntity entity) {
		
		return testRepo.save(entity);
	}

	@Override
	public List<TestEntity> getData() {
		return testRepo.findAll();
	
	}  

	@Override
	public TestEntity updateData(long id,TestEntity update) {
		TestEntity obj = testRepo.findById(id).get();
		obj.setName(update.getName());
 		obj.setAddress(update.getAddress());
		obj.setMobile(update.getMobile());
		return testRepo.save(obj);	
	}

	@Override
	public String deleteData(long id) {
		testRepo.deleteById(id);
		return "deleted successfully ";
	}
	
}
