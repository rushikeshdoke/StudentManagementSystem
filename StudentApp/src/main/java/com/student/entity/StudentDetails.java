package com.student.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="student_details")
@Data
public class StudentDetails extends Auditable {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "student_details_id")
	    private Long studentDetailsId;

	    @Column(name = "first_name", nullable = false, length = 100)
	    private String firstName;

	    @Column(name = "middle_name", length = 100)
	    private String middleName;

	    @Column(name = "last_name", nullable = false, length = 100)
	    private String lastName;

	    @Column(name = "date_of_birth", nullable = false)
	    private LocalDate dateOfBirth;

	   
	    @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "category_id", nullable = false)
	    private CategoryMaster categoryMaster;

	    
	    @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "caste_id", nullable = false)
	    private CasteMaster casteMaster;

	    
	    @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "department_id", nullable = false)
	    private DepartmentMaster departmentMaster;

	    
	    @Column(name = "ssc_score", precision = 5, scale = 2)
	    private BigDecimal sscScore;

	    @Column(name = "hsc_score", precision = 5, scale = 2)
	    private BigDecimal hscScore;

	    @Column(name = "cet_score", precision = 5, scale = 2)
	    private BigDecimal cetScore;
}
