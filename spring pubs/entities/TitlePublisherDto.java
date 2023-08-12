package com.i3.springpubs.entities;

public class TitlePublisherDto {

	private String title;
	private String name;

	
	
	public TitlePublisherDto(String title, String name) {
		super();
		this.title = title;
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
