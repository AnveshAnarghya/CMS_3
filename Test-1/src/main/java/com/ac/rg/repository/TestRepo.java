package com.ac.rg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ac.rg.entity.TestEntity;

public interface TestRepo extends JpaRepository<TestEntity, Long> {

}
