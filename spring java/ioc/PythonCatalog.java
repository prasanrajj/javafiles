package ioc;

import java.util.List;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component(value="python")
//@Lazy
public class PythonCatalog implements Catalog{
  	
	public PythonCatalog() {
	    System.out.println("PythonCatalog()");
	}

	@Override
	public List<String> getBooks() {
	    return List.of("Python in Nutshell", "Thinking of Python");
	}

}
