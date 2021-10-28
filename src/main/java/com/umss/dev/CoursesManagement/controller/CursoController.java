package com.umss.dev.CoursesManagement.controller;

import java.util.List;


import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonView;
import com.umss.dev.CoursesManagement.model.Views;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import com.umss.dev.CoursesManagement.model.Curso;


import com.umss.dev.CoursesManagement.service.CursoService;


@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class CursoController {

	@Autowired
	private CursoService cursoService;

	@GetMapping("/curso")
	@JsonView(Views.MyResponseViews.class)
	public List<Curso> getCursos(
			@RequestParam(required = false) String search)
	{
		if (search==null ||search.isEmpty())
		{
			return cursoService.findAll();
		}
		else
		{
			return cursoService.Search(search);
		}
	}

	@GetMapping("/curso/{id}")
	@JsonView(Views.MyResponseViews.class)
	public Optional<Curso> obtenerCurso(@PathVariable Long id){
	return cursoService.findById(id);
	}

	
}