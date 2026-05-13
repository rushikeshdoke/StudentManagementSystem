package com.student;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.request.dto.AddStudentDto;

@RestController
@RequestMapping("/student")
public class StudentManageController {

	@PostMapping("/add")
	public ResponseEntity<Map<String, Object>> addStudent(@RequestBody AddStudentDto addStudentDto){
		
		System.out.println("==================>"+addStudentDto);
		return null;
		
	}
}
