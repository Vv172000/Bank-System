package com.bank;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bank.entity.UserPojo;
import com.bank.respo.BankRespo;
import com.bank.service.BankService;

@SpringBootApplication
@RestController

public class BasicbankApplication {
	public static void main(String[] args) {
		SpringApplication.run(BasicbankApplication.class, args);
	}
}
	
	