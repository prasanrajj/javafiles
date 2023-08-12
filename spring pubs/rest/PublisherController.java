package com.i3.springpubs.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.i3.springpubs.entities.PubRepo;
import com.i3.springpubs.entities.PublisherTitlesCountRecord;

@RestController
public class PublisherController {

	@Autowired
	PubRepo pubRepo;

	@GetMapping("/pubtitlescount")
	public List<PublisherTitlesCountRecord> getTitlesCount(){
		return   pubRepo.getTitlesCount();
	}
}
