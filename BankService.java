package com.bank.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.bank.entity.UserPojo;
import com.bank.respo.BankRespo;
import com.bank.service.BankService;

@Service
public class BankService {
	
	@Autowired
	public BankRespo bankrespo;

	public UserPojo saveUser(String name, String phno, String email,double balance) {
		UserPojo pojo=new UserPojo();
		pojo.setName(name);
		pojo.setPhno(phno);
		pojo.setPhno(phno);
		pojo.setEmail(email);
		pojo.setBalance(balance);
		return bankrespo.save(pojo);
	}



	public List<UserPojo> readData() {
		
		
		return bankrespo.findAll();
	}
	
	public Optional<UserPojo> readSpecifi(Long userId){
		return bankrespo.findById(userId);
		
	}

	public void deleteData(Long userId) {
		
		bankrespo.deleteById(userId);
		
		
	}

	public Double updateBalance(Long id,double balance) {
	
	UserPojo pojo=	bankrespo.findById(id).get();//
	double dBbalance =	pojo.getBalance();//10000
	double afterDeduction=dBbalance-balance;
	pojo.setBalance(afterDeduction);
	bankrespo.save(pojo);
	return afterDeduction;	
	}

	public Double updateDeposit(long id, double balance) {
		
		UserPojo pojo =bankrespo.findById(id).get();
		double dbbalance=pojo.getBalance();
		double afterDeposit=dbbalance+balance;
		pojo.setBalance(afterDeposit);
		bankrespo.save(pojo);
		return afterDeposit;
		
	}




}

