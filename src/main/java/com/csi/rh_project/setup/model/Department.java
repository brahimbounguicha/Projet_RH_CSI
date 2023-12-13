package com.csi.rh_project.setup.model;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@jakarta.persistence.Entity
@Table(name = "departments")
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "department_name")
	private String name;



	public Department() {

	}

	public Department(String name) {
		this.name = name;
	}

    public void setName(String name) {
		this.name = name;
	}

}
