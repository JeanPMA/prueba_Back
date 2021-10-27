package com.umss.dev.CoursesManagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.umss.dev.CoursesManagement.model.UsuarioLogin;
import com.umss.dev.CoursesManagement.service.UsuarioPruebaService;



@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class UsuarioPruebaController {
	@Autowired
	private UsuarioPruebaService usuarioPruebaService;
	@GetMapping("/usuarios")
	public List<UsuarioLogin> getUsuarios(){
		return usuarioPruebaService.findAll();
		
	}
	@GetMapping("/usuarios/{id}")
	public Optional<UsuarioLogin> obtenerUsuario(@PathVariable Long id){
	return usuarioPruebaService.findById(id);
	}

}