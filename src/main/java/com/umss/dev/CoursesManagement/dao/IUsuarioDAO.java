package com.umss.dev.CoursesManagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.umss.dev.CoursesManagement.model.UsuarioLogin;

@Repository
public interface IUsuarioDAO extends JpaRepository<UsuarioLogin,Long> {
	public UsuarioLogin findByUsername(String username);

}
