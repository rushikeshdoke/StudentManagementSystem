package com.student.entity;

import java.time.LocalDate;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class StudentDetails extends Auditable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long studentDetailsId;
	
	private String firstName;
	
	private String middleName;
	
	private String lastName;
	
	private LocalDate dateOfBirth;
	
	 
}
