package ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//@Component 
public class ShowCatalog implements CommandLineRunner {
 	//@Autowired(required = false)
	Catalog cat;
	
	
	public ShowCatalog() {
		System.out.println("ShowCatalog()");
	}


	@Override
	public void run(String... args) throws Exception {
		System.out.println("Catalog : " + cat);
		
	}

}
