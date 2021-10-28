package com.umss.dev.CoursesManagement.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.umss.dev.CoursesManagement.model.UsuarioInstructor;
import com.umss.dev.CoursesManagement.repository.UsuarioRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class UsuarioService {
	//
	private UsuarioRepository usuarioRepository;
	private Logger logger = LoggerFactory.getLogger(UsuarioService.class);
	public UsuarioService(UsuarioRepository usuarioRepository) {
		super();
		this.usuarioRepository = usuarioRepository;
	}

	public List<UsuarioInstructor> findAll() {
		return usuarioRepository.findAll();
	}
	public Optional<UsuarioInstructor> findById(Long id){
		logger.info("se esta obteniendo un curso especifico");
		return usuarioRepository.findById(id);
		}
	
	//////////

	


}





