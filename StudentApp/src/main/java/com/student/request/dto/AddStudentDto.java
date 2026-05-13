package com.student.request.dto;

import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDate;


@Data
public class AddStudentDto {

	    
	    private String emailId;

	    private String password;

	    private String firstName;

	    private String middleName;

	    private String lastName;

	    private LocalDate dateOfBirth;

	    private Long categoryId;

	    private Long casteId;

	    private Long departmentId;   

	    private BigDecimal sscScore;

	    private BigDecimal hscScore;

	    private BigDecimal cetScore;
}
