package com.umss.dev.CoursesManagement.service;


import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


import com.umss.dev.CoursesManagement.model.UsuarioLogin;

import com.umss.dev.CoursesManagement.repository.UsuarioPruebaRepository;

@Service
public class UsuarioPruebaService {
	private UsuarioPruebaRepository usuarioPruebaRepository;
	private Logger logger = LoggerFactory.getLogger(InstructorService.class);
	public UsuarioPruebaService(UsuarioPruebaRepository usuarioPruebaRepository) {
		super();
		this.usuarioPruebaRepository = usuarioPruebaRepository;
	}

	public List<UsuarioLogin> findAll() {
		return usuarioPruebaRepository.findAll();
	}
	public Optional<UsuarioLogin> findById(Long id){
		logger.info("se esta obteniendo un usuario especifico");
		return usuarioPruebaRepository.findById(id);
		}
	
}