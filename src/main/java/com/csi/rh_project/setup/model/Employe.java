package com.csi.rh_project.setup.model;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@jakarta.persistence.Entity
@Table(name = "employes")
public class Employe {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "employe_name")
	private String name;



	public Employe() {

	}

	public Employe(String name) {
		this.name = name;
	}

    public void setName(String name) {
		this.name = name;
	}

}
