package com.i3.springpubs.entities;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Table(name = "publishers")
@Entity
public class Publisher {
	@Id
	@Column (name = "pub_id")
	private int id;
	
	@Column (name = "pub_name")
	private String name;
	
	private String city;
	@OneToMany(mappedBy = "publisher", fetch = FetchType.EAGER)
	@JsonIgnore
	private List<Title> titles = new ArrayList<Title>();

	public List<Title> getTitles() {
		return titles;
	}

	public void setTitles(List<Title> titles) {
		this.titles = titles;
	}

	public int getId() {
		return id;
	}

	public void setId(int pub_id) {
		this.id = pub_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String pub_name) {
		this.name = pub_name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}