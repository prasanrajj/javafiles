package com.i3.springpubs.entities;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PubRepo extends JpaRepository<Publisher, Integer> {

	Publisher findByCity(String city);

	@Query("select new com.i3.springpubs.entities.PublisherTitlesCountRecord(name as name, size(titles) as count ) from Publisher")
	List<PublisherTitlesCountRecord> getTitlesCount();

}