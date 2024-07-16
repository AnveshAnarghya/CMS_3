package com.ac.signUp.Service;

import java.util.List;

import com.ac.signUp.entity.RegistrationEntity;

public interface RegistrationService  {
	
	public RegistrationEntity SaveData(RegistrationEntity Entity);
	public RegistrationEntity UpdateData(long id, RegistrationEntity Update);
	public RegistrationEntity getDataById(long id);
	public List<RegistrationEntity> getData();
	public String DeleteData(long id);
	
	public RegistrationEntity login(String email, String password);

}
