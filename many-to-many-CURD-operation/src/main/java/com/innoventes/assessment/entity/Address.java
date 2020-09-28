package com.innoventes.assessment.entity;

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
import javax.persistence.ManyToMany;
import javax.persistence.Table;
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
@Table(name = "address")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "add_id")
	private UUID id;
	
	@NotNull
	@Size(min = 5, message = "Address Line One should be minimum 5 characters.")
	@Column(name = "addrLineOne")
	private String addrLineOne;
	
	@Column(name = "addrLineTwo")
	private String addrLineTwo;
	
	@NotNull(message = "city name cannot be blank.")
	@Column(name = "city")
	private String city;

	@ManyToMany(mappedBy = "addresses", fetch = FetchType.LAZY)
	private Set<Employee> employees = new HashSet<>();
	
	
	

}
