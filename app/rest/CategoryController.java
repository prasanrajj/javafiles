package app.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import app.entities.Category;

@RestController
public class CategoryController {
	 
	@PostMapping("/categories")
	public void addCategory(@RequestBody Category category) {
		  System.out.println("Added Category!");
	}
	@GetMapping("/categories")
	public String getCategory() {
		  return "Categories";
	}
 
}
