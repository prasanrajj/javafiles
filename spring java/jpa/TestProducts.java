package jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

//@SpringBootApplication
public class TestProducts implements CommandLineRunner {
	@Autowired
	private ProductRepo productRepo;

	public static void main(String[] args) {
		SpringApplication.run(TestProducts.class, args);
	}
	
	public  void printPage(int pageno) {
		var page =  productRepo.findAll( PageRequest.of(pageno, 5));
		
		for(var p : page)
			System.out.println(p.getName());
		
		 
	}
	
	public  void sortByCategoryAndPrice() {
		var page =  productRepo.findAll(Sort.by("category").ascending()
				       .and(Sort.by("price").descending()));
		
		for(var p : page)
			System.out.printf("%-10s %-30s %8.2f\n", p.getCategory().getCode(), 
					   p.getName(), p.getPrice());
	}
	
	@Override
	public void run(String... args) throws Exception {

//            for ( var p : productRepo.findAll()) {
//            	System.out.printf("%-20s %-20s\n", 
//            			p.getName(), p.getCategory().getDescription());

//		for (var p : productRepo.getAllNameDesc()) {
//			System.out.printf("%-20s %-20s\n", p.getName(), p.getCategory().getDescription());
//		}
		
		//printPage(0);
		sortByCategoryAndPrice();
	}

}
