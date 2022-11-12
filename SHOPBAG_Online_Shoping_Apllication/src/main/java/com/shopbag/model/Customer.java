package com.shopbag.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer customerId;
	
	@NotNull(message = "firstName required to fill")
	private String firstName;
	
	@NotNull(message = "lastname required to fill")
	private String lastname;
	
	@NotNull(message = "mobileNumber required to fill")
	private String mobileNumber;
	
	@NotNull(message = "email required to fill")
	private String email;
	
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "customer")
	private Address address;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Order> order = new ArrayList<>();
	
	
	
	
	
}
























