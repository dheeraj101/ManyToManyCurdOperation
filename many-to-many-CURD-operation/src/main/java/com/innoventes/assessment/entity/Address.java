package com.innoventes.assessment.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "address")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "add_id")
	private long id;
	
	@NotNull
	@Size(min = 5)
	@Column(name = "addrLineOne")
	private String addrLineOne;
	
	@Column(name = "addrLineTwo")
	private String addrLineTwo;
	
	@NotNull
	@Column(name = "city")
	private String city;

	public Address(@NotNull String addrLineOne, String addrLineTwo, @NotNull String city) {
		this.addrLineOne = addrLineOne;
		this.addrLineTwo = addrLineTwo;
		this.city = city;
	}

	public long getId() {
		return id;
	}

	public String getAddrLineOne() {
		return addrLineOne;
	}

	public void setAddrLineOne(String addrLineOne) {
		this.addrLineOne = addrLineOne;
	}

	public String getAddrLineTwo() {
		return addrLineTwo;
	}

	public void setAddrLineTwo(String addrLineTwo) {
		this.addrLineTwo = addrLineTwo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	

}
