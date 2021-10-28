package com.umss.dev.CoursesManagement.model;

import com.fasterxml.jackson.annotation.JsonView;

import javax.persistence.*;

@Entity
@Table(name="Curso")
public class Curso {
	@Id
	@JsonView(Views.MyResponseViews.class)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_curso;
	@JsonView(Views.MyResponseViews.class)
	private String nombre;
	@JsonView(Views.MyResponseViews.class)
	private String descripcion;
	private String ubicacion;
	@JsonView(Views.MyResponseViews.class)
	@ManyToOne
	@JoinColumn(name="id_instructor")
	private Instructor instructor;

	public Curso() {
		super();
	}

	public Curso(String nombre, String descripcion, String ubicacion,Instructor instructor) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.ubicacion = ubicacion;
		this.instructor = instructor;
	}

	public long getId_curso() {
		return id_curso;
	}

	public void setId_curso(long id_curso) {
		this.id_curso = id_curso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
}
