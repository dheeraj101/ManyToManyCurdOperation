package com.innoventes.assessment.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "employeeAddress")
public class EmployeeAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "empAddId")
	private long id;
	
	@NotNull
	@ManyToOne
    @MapsId("add_id")
    @JoinColumn(name = "add_id")
	@Column(name = "address")
	private Address address;
	
	@NotNull
	@ManyToOne
	@MapsId("emp_id")
	@JoinColumn(name = "emp_id")
	@Column(name = "employee")
	private Employee employee;
	
	@Column(name = "addressType")
	private String addressType;

	public EmployeeAddress(@NotNull Address address, @NotNull Employee employee, String addressType) {
		this.address = address;
		this.employee = employee;
		this.addressType = addressType;
	}

	public long getId() {
		return id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	
	
	
	
	
}
