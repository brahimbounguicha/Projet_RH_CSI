package com.csi.rh_project.setup.model;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@jakarta.persistence.Entity
@Table(name = "employeType")
public class employeType {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "type_name")
	private String name;



	public employeType() {

	}

	public employeType(String name) {
		this.name = name;
	}

    public void setName(String name) {
		this.name = name;
	}

}
