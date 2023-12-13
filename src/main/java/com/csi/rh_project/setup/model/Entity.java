package com.csi.rh_project.setup.model;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@jakarta.persistence.Entity
@Table(name = "entities")
public class Entity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "entity_name")
	private String name;

	@Column(name = "country_code")
	private String countryCode;



	public Entity() {

	}

	public Entity(String name, String countryCode) {
		this.name = name;
		this.countryCode = countryCode;
	}

    public void setName(String name) {
		this.name = name;
	}

    public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}


	@Override
	public String toString() {
		return "Tutorial [id=" + id + ", name=" + name + ", country code=" + countryCode + "]";
	}

}
