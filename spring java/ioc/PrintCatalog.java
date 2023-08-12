package ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class PrintCatalog implements CommandLineRunner {

	@Autowired
	// @Qualifier("python")
	Catalog catalog;

//	@Autowired
//	Catalog cat;

	public PrintCatalog() {
		System.out.println("PrintCatalog()");
		System.out.println(catalog);
	}

	@PostConstruct
	public void init() {
		System.out.println("PostConstruct");
		System.out.println(catalog);
	}
	
	@PreDestroy
	public void beforeDestory() {
		System.out.println("PreDestory");
	}

	@Override
	public void run(String... args) throws Exception {
		//System.out.println(catalog.hashCode());
		//System.out.println(cat.hashCode());

		for (var book : catalog.getBooks())
			System.out.println(book);

	}

}
