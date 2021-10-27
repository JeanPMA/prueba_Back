package com.umss.dev.CoursesManagement.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.umss.dev.CoursesManagement.model.UsuarioLogin;
@Repository
public interface UsuarioPruebaRepository extends JpaRepository <UsuarioLogin, Long> {

}
