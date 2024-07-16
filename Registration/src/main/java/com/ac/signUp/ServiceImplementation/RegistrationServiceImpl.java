package com.ac.signUp.ServiceImplementation;

import java.util.List;

import javax.swing.text.html.parser.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ac.signUp.Repository.RegistrationRepository;
import com.ac.signUp.Service.RegistrationService;
import com.ac.signUp.entity.RegistrationEntity;
@Service
public class RegistrationServiceImpl implements RegistrationService {
	@Autowired
	public RegistrationRepository registrationRepo;


	@Override
	public RegistrationEntity SaveData(RegistrationEntity Entity) {
		
		return registrationRepo.save(Entity);
	}

	@Override
	public RegistrationEntity UpdateData(long id, RegistrationEntity Update) {
		RegistrationEntity  Update1=registrationRepo.findById(id).get();
		 Update1.setEntityName(Update.getEntityName());
		 Update1.setLogo(Update.getLogo());
		 Update1.setAddress(Update.getAddress());
		 Update1.setMandel(Update.getMandel());
		 Update1.setDistrict(Update.getDistrict());
		 Update1.setCity(Update.getCity());
		 Update1.setPincode(Update.getPincode());
		 Update1.setState(Update.getState());
		 Update1.setCountry(Update.getCountry());
		 Update1.setMobile(Update.getMobile());
		 Update1.setEmail(Update.getEmail());
		 Update1.setWebsite(Update.getWebsite());
		 Update1.setYoutube(Update.getYoutube());
		 Update1.setInstagram(Update.getInstagram());
		 Update1.setFB(Update.getFB());
		 Update1.setTwitter(Update.getTwitter());
		 Update1.setAboutChruch(Update.getAboutChruch());
		 return	registrationRepo.save(Update1);
		}

	@Override
	public RegistrationEntity getDataById(long id) {
		
		return registrationRepo.findById(id).get() ;
	}

	@Override
	public List<RegistrationEntity> getData() {
		return registrationRepo.findAll() ;
	}

	@Override
	public String DeleteData(long id) {
		registrationRepo.deleteById(id);
		return "deleted";
	}

	@Override
	public RegistrationEntity login(String email, String password) {
		
		return registrationRepo.findByEmailAndPassword(email,password);
	}



}
