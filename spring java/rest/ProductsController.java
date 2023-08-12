package rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@CrossOrigin 
public class ProductsController {
	@Autowired
	private ProductRepo productRepo;

	@GetMapping("/products")
	@Operation(description = "Gets all products")
	public List<Product> getAllProducts() {
		return productRepo.findAll();	
	}
	
	@DeleteMapping("/productByName/{name}")
	public void deleteProductByName(@PathVariable("name") String name) {
		 var product = productRepo.findByName(name);
		 if(product != null) {
			 productRepo.delete(product);
		 }
		 else
			 throw new ResponseStatusException( HttpStatus.NOT_FOUND,"Product name not found");
	}
	
	 
	
	@GetMapping("/products/category/{category}")
	public List<Product> getProductsByCategory(
			@PathVariable("category") String category) {
		return productRepo.findByCategory(category);
	}
	@GetMapping("/costlyProducts")
	public List<Product> costlyProducts() {
		 	var page =   productRepo.findAll
		 			(PageRequest.of(0, 5, Sort.by("price").descending()));
		 	return page.getContent();
	}
	
	@GetMapping("/costlyProductsPage")
	@Operation(summary = "Get top most 5 costly products")
	public Page<Product> costlyProducts2() {
		 	return  productRepo.findAll
		 			(PageRequest.of(0, 5, Sort.by("price").descending()));
	}
 
}
