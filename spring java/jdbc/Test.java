package jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Test implements CommandLineRunner {

	@Autowired
	CategoryCRUD cats;
	
	public static void main(String[] args) {
		SpringApplication.run(Test.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		try {
			System.out.println("Swapping Descriptions!");
			cats.swapDescriptions("cat111", "cat123");
			System.out.println("Operation Completed!");
		} catch (Exception ex) {
			System.out.println(ex);
			System.out.println("Operation Failed");
		}
		
	}
	
	

}
