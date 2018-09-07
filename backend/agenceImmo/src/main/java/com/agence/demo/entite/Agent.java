package com.agence.demo.entite;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Agent implements Serializable {
	
	
	@Id
	@GeneratedValue
	private long id;
	private String nom;
	private String prenom;
	private String motdepass;
	private String Email;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getMotdepass() {
		return motdepass;
	}
	public void setMotdepass(String motdepass) {
		this.motdepass = motdepass;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Agent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Agent(String nom, String prenom, String motdepass, String email) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.motdepass = motdepass;
		Email = email;
	}

}
