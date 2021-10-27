package com.umss.dev.CoursesManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.umss.dev.CoursesManagement.dao.IUsuarioDAO;
import com.umss.dev.CoursesManagement.model.UsuarioLogin;



@Service
public class UsuarioServiceImpl implements IUsuarioService {
	
	@Autowired
	private IUsuarioDAO usuarioDao;

	@Override
	public UsuarioLogin finByUsername(String username) {
		return usuarioDao.findByUsername(username);
	}


}
