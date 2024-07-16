package com.ac.signUp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ac.signUp.entity.RegistrationEntity;

public interface RegistrationRepository extends JpaRepository<RegistrationEntity,Long > {

	RegistrationEntity findByEmailAndPassword(String email, String password);

}
