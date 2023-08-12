package com.i3.springpubs.entities;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "authors")
public class Author {
	@Id
	@Column(name = "au_id")
	private String id;

	@Column(name = "au_fname")
	private String name;

	private String city;
	@ManyToMany(mappedBy = "authors")
	@JsonIgnore
	Set<Title> titles;
		
	
	public Set<Title> getTitles() {
		return titles;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + "]";
	}

	

}