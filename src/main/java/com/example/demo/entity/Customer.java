package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "customer")
@Data
public class Customer {
	@Id
	private int custid;
	private String name;
	private String address;
	private String phone;
}


