package com.csi.rh_project.setup.model;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@jakarta.persistence.Entity
@Table(name = "roles")
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "role_name")
	private String name;



	public Role() {

	}

	public Role(String name) {
		this.name = name;
	}

    public void setName(String name) {
		this.name = name;
	}

}
