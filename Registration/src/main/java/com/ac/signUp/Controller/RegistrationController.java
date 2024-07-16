package com.ac.signUp.Controller;


import java.util.List;
import java.util.Map;

import javax.imageio.spi.RegisterableService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ac.signUp.Service.RegistrationService;
import com.ac.signUp.entity.RegistrationEntity;

@RestController
@CrossOrigin("*")
public class RegistrationController {
@Autowired
public RegistrationService registrationService;

@PostMapping("/save")
public ResponseEntity<RegistrationEntity> Save(@RequestBody RegistrationEntity Entity){
	RegistrationEntity save=registrationService.SaveData(Entity);
	return ResponseEntity.status(HttpStatus.CREATED).body(save);
}
@GetMapping("getall")
public ResponseEntity<List<RegistrationEntity>> getEntity(){
	 List<RegistrationEntity>entities=registrationService.getData();
return ResponseEntity.status(HttpStatus.OK).body(entities);	 
}
@DeleteMapping("/deleteby/{id}")
public ResponseEntity<String> deleteById(@PathVariable long id){
 String deleteById =registrationService.DeleteData(id);
	return ResponseEntity.status(HttpStatus.OK).body(deleteById);
}
@GetMapping("/getById/{id}")
public ResponseEntity< RegistrationEntity> getById(@PathVariable long id){
	RegistrationEntity getById =registrationService.getDataById(id);
		return ResponseEntity.status(HttpStatus.OK).body(getById);

	}

@PutMapping("/update/{id}")
public ResponseEntity< RegistrationEntity> update(@RequestBody RegistrationEntity update,@PathVariable int id){
	 RegistrationEntity update1=registrationService.UpdateData(id,update);
	return ResponseEntity.status(HttpStatus.CREATED).body(update1);
}
//@PostMapping("/login")
//public ResponseEntity<RegistrationEntity> login(@RequestBody  Map<String, String> loginRequest){
//	String email= loginRequest.get("email");
//	String password= loginRequest.get("password");
//
//if (email != null && password != null) {
//	 RegistrationEntity login = registrationService.login(email, password);
//	if(login != null) 
//		  return ResponseEntity.ok("Login Successful. Welcome, " + login.getEntityName());
//		//return ResponseEntity.ok("Login Successful Welcome, "+login.getEntityName());
//		//return ResponseEntity.status(HttpStatus.CREATED).body(email);
//	else 
//		//return ResponseEntity.ok("Login Failed Not Found Credentials.");
//	}
		
//return ResponseEntity.ok("Login Failed");
@PostMapping("/login")
public ResponseEntity<String> login(@RequestBody Map<String, String> loginRequest) {
    String email = loginRequest.get("email");
    String password = loginRequest.get("password");

    if (email != null && password != null) {
        RegistrationEntity login = registrationService.login(email, password);
        if (login != null) {
            return ResponseEntity.ok("Login Successful. Welcome, " + login);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Login Failed. Credentials not found.");
        }
    }

    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Login Failed. Missing userId or password.");
}
}
