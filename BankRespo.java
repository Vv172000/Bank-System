package com.bank.respo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.entity.UserPojo;

@Repository

public interface BankRespo extends JpaRepository<UserPojo, Long>{
	
	

}
