package jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class Test implements CommandLineRunner {
	@Autowired
	private CategoryRepo catRepo;
	

	public static void main(String[] args) {
		SpringApplication.run(Test.class, args);
		

	}

	public void displayAll() {
		// display all categories
		for (var c : catRepo.findAll())
			System.out.println(c.getDescription());
 
	}
	
	public void addCategory(String code, String desc) {
		var c = new Category();
		c.setCode(code);
		c.setDescription(desc);
		catRepo.save(c);
		System.out.println("Added Category");
	}

	public void displayLongCategories() {

		for (var c : catRepo.getLongCategories())
			System.out.println(c.getDescription());
	}

	public void displayLongCategories(int min, int max) {
        // JPQL 
		for (var c : catRepo.getLongCategories(min, max))
			System.out.println(c.getDescription());
	}
	
	public void displayCategoriesByLongDesc(int min, int max) {
        // Native Query
		for (var c : catRepo.getCategoriesByLength(min,max))
			   System.out.println(c.getDescription());
	}
	
	public void displayCategoriesByDesc(String desc) {
		// display all categories
		for (var c : catRepo.findByDescriptionContaining(desc))
			System.out.println(c);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		//System.out.println(catRepo.getClass());
		//displayAll();
		
		
        Category cat = catRepo.findByDescription("Printer");
        System.out.println(cat);

		// displayCategoriesByDesc("o");
		// System.out.println(catRepo.countByDescriptionContaining("o"));

		//displayLongCategories();
		//displayLongCategories(5,10);
		
		// displayCategoriesByLongDesc(10,20);
	}

}
