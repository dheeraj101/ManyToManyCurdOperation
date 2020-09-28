package com.innoventes.assessment.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.validation.annotation.Validated;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Validated
@ToString
@Table(name = "employee")
public class Employee {

	@Id
	@Column(name = "emp_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	
	@NotNull(message = "Name cannot be blank.")
	@Size(min = 3, message = "name should be minimum 3 characters.")
	@Column(name = "emp_name", nullable = false)
	private String name;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "emo_dob", nullable = false)
	private Date dateOfbirth = new Date();

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@JoinTable(name = "EmployeeAddress",
		joinColumns = {
			@JoinColumn(name = "employee", referencedColumnName = "emp_id", nullable = false, updatable = false)},
//			@JoinColumn(name = "addressType", referencedColumnName = "addressType")},
		inverseJoinColumns = {
			@JoinColumn(name = "address", referencedColumnName = "add_id", nullable = false, updatable = false)
		})
	private Set<Address> addresses = new HashSet<>();
	
	
	
}
