package jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

//@SpringBootApplication
public class TestJDBC implements CommandLineRunner {
	@Autowired
	CategoryManager cats;
	 

	@Autowired
	SJIDemo sjiDemo;

	public static void main(String[] args) {
		SpringApplication.run(TestJDBC.class, args);
	}
	
	
	public void run(String... args) {
		//cats.showCategoryCount();
		
		// cats.showCategoryCount();
		// cats.listCategoryCodes();
		// cats.updateCatDescWithNames("c3", "Category 3");
		// sjiDemo.add("c5","Category 5");

		//cats.sale(100,2);
		
//		try {
//			System.out.println("Swapping Descriptions!");
//			cats.swapDescriptions("c5","c30");
//			System.out.println("Operation Completed!");
//		} catch (Exception ex) {
//			System.out.println("Operation Failed");
//		}
		
		cats.printCategoryAvgPrice();
		
	}

}
