package com.agence.demo.entite;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Article implements Serializable {
	@Id
	@GeneratedValue
	private long id;
	private String emplacement;
	private String type;

	private Date datedelaarticle;
	private long prix;
	private String photo;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmplacement() {
		return emplacement;
	}

	public void setEmplacement(String emplacement) {
		this.emplacement = emplacement;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getDatedelaarticle() {
		return datedelaarticle;
	}

	public void setDatedelaarticle(Date datedelaarticle) {
		this.datedelaarticle = datedelaarticle;
	}

	public long getPrix() {
		return prix;
	}

	public void setPrix(long prix) {
		this.prix = prix;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Article(String emplacement, String type, Date datedelaarticle, long prix, String photo) {
		super();
		this.emplacement = emplacement;
		this.type = type;
		this.datedelaarticle = datedelaarticle;
		this.prix = prix;
		this.photo = photo;
	}
}
