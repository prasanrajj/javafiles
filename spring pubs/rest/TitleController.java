package com.i3.springpubs.rest;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.i3.springpubs.entities.AuthorRepo;
import com.i3.springpubs.entities.PubRepo;
import com.i3.springpubs.entities.Title;
import com.i3.springpubs.entities.TitlePubView;
import com.i3.springpubs.entities.TitlePublisherDto;
import com.i3.springpubs.entities.TitleRepo;

@RestController
public class TitleController {
	@Autowired
	TitleRepo tr;
	@Autowired
	AuthorRepo ar;
	@Autowired
	PubRepo pr;
	
	@GetMapping("/Titles")
	public List<Title> getTitles(@RequestParam("min")double min,@RequestParam("max")double max)
	{
		return tr.getTitleBYPriceRange(min, max);
	}
	
	@GetMapping("/TitleByAuid")
	public Set<Title> getTitles(@RequestParam("au_id")String au_id)
	{
		return ar.findById(au_id).get().getTitles();
	}
	
	@GetMapping("/topTitles")
	public List<Title> topTitles()
	{
		return tr.getTopFive();
	}
	
	@GetMapping("/titleByType")
	public List<Title> getTitlesOfType(@RequestParam("type")String type)
	{
		return tr.getTitleByType(type);
	}
	
	@GetMapping("/titleByCity")
	public List<Title> getTitleByCity(@RequestParam("city")String city)
	{
		return pr.findByCity(city).getTitles();
	}
	
	@PutMapping("/updateTitle")
	public Title setTitlePrice(@RequestParam("id")String id,@RequestParam("price")double price)
	{
		var title=tr.findById(id);
		if(title.isPresent())
		{
			var t=title.get();
			t.setPrice(price);
			tr.save(t);
			return t;
		}
		else
			throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Data not found ");
	}
	
	@GetMapping("/titles/{city}")
	public List<Title> getTitlesByCity(@PathVariable("city") String city) {
		//return  tr.getTitlesByCity(city);
		return tr.findByPublisher_city(city);	
	}
	
	@GetMapping("/titles/author/{auid}")
	public List<Title> getTitlesByAuthor(@PathVariable("auid") String auid) {
		return  tr.getTitlesByAuthor(auid);
	}

	@GetMapping("/titles/top5")
	public List<Title> getTop5Titles() {
		 var titles =  tr.findAll(PageRequest.of(0,5, Sort.by("ytdSales").descending()));
		 return titles.getContent();
	}
	
	@GetMapping("/titles/auid/{auid}")
	public List<Title> getTitlesByAuthorId(@PathVariable("auid") String auid) {
		return  tr.getTitlesByAuthorId(auid);
	}
	
	@GetMapping("/titleandpublisher")
	public List<TitlePubView> getTitleAndPublisher(){
		return  tr.getTitleAndPublisher();
	}
	
	@GetMapping("/titlesdto")
	public List<TitlePublisherDto> getTitleAndPublisherDto(){
		return  tr.getTitleAndPublisherDto();
	}
}