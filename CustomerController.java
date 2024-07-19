package com.bank.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.bank.entity.UserPojo;
import com.bank.service.BankService;
@RestController
public class CustomerController {
	@Autowired
	public BankService bankservice;

	@GetMapping("/save")
	public UserPojo insertData(@RequestParam String name,@RequestParam String phno,@RequestParam String email,@RequestParam double balance) {
		
		return bankservice.saveUser(name,phno,email,balance);
		
	}
	@GetMapping("/read")
	public List<UserPojo> readData(){
		return bankservice.readData();
	}
	
	@GetMapping("/read/{id}")
	public Optional<UserPojo> readSpecifi(@PathVariable("id") Long userId){
		return bankservice.readSpecifi(userId);
		
	}
	@PutMapping("/update/{id}/{balance}")
	public ResponseEntity<String> updateBalance(@PathVariable Long id,@PathVariable Double balance) {
		bankservice.updateBalance(id,balance);
		return new ResponseEntity<String>("balance is updates the current balance is", HttpStatus.CREATED);
		
	}
	
	@PutMapping("/update/deposit/{id}/{balance}")
	public ResponseEntity<String> updateDeposit(@PathVariable long id,@PathVariable Double balance){
		bankservice.updateDeposit(id,balance);
		return new ResponseEntity<String>("balance is deposited",HttpStatus.CREATED);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteData(@PathVariable("id") Long userId) {
		 bankservice.deleteData(userId);
		
		 return "dleted successfully";
	}
	

}
