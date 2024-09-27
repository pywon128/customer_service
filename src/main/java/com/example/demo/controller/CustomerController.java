package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.CustomerDAO;
import com.example.demo.entity.Customer;

@Controller
public class CustomerController {
	@Autowired
	private CustomerDAO dao;
	
	@CrossOrigin(origins = "*")
	@GetMapping("/customer/list")
	@ResponseBody
	public List<Customer> list(){
		return dao.findAll();
	}
	
	@PostMapping("/customer/insert")
	public String insertSubmit(Customer c) {
		dao.save(c);
		return "redirect:/customer/list";
	}
}
