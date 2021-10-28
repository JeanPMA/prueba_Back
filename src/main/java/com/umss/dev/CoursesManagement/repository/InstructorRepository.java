package com.umss.dev.CoursesManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import com.umss.dev.CoursesManagement.model.Instructor;

@Repository
//crear, eliminar, mostrar
public interface InstructorRepository extends JpaRepository<Instructor, Long> {

}
