package com.putacollartoyourchild.app.entity.model;
//Clase que se corresponde con la tabla de la BD.
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="app_user")
public class AppUser  implements Serializable{

	private static final long serialVersionUID = 1L;
	/*Clave principal autonumérica*/
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	long id;
	
	String name;
	String surname;
	
	
	public AppUser() {
		super();
	}
	public AppUser(long id, String name, String surname) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	

}
