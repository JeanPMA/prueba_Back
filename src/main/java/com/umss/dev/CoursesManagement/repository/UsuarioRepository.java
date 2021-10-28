package com.umss.dev.CoursesManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.umss.dev.CoursesManagement.model.UsuarioInstructor;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioInstructor,Long> {
//	public Usuario findByUsername(String username);

}