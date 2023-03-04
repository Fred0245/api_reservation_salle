package com.apiprojetsalle.reservationsalle.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("Administrateur")
@Table(name = "administrateurs")
public class Administrateur extends Personne {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	protected Long id;

	public Administrateur() {

	}

	

	public Administrateur(Long id) {
		super();
		this.id = id;
	}



	@Override
	public Long getId() {
		return id;
	}

}
