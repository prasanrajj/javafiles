package rest;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CatsRepo extends JpaRepository <Category,String>{
	
	 List<Category> findByDescriptionContaining(String description);
}
