package com.umss.dev.CoursesManagement.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.umss.dev.CoursesManagement.model.Instructor;
import com.umss.dev.CoursesManagement.repository.InstructorRepository;

@Service
public class InstructorService {
	private InstructorRepository instructorRepository;
	private Logger logger = LoggerFactory.getLogger(InstructorService.class);
	public InstructorService(InstructorRepository instructorRepository) {
		super();
		this.instructorRepository = instructorRepository;
	}

	public List<Instructor> findAll() {
		return instructorRepository.findAll();
	}
	public Optional<Instructor> findById(Long id){
		logger.info("se esta obteniendo un curso especifico");
		return instructorRepository.findById(id);
		}
	
}
