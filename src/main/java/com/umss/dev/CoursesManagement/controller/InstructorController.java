package com.umss.dev.CoursesManagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.umss.dev.CoursesManagement.model.Instructor;
import com.umss.dev.CoursesManagement.service.InstructorService;

@RestController
@RequestMapping("/api")
public class InstructorController {
	
	@Autowired
	private InstructorService instructorService;
	@GetMapping("/instructor")
	public List<Instructor> getInstructores(){
		return instructorService.findAll();
		
	}
	@GetMapping("/instructor/{id}")
	public Optional<Instructor> obtenerInstructor(@PathVariable Long id){
	return instructorService.findById(id);
	}
	

}
