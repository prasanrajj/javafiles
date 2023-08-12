package app.rest;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityDemo {
	 
	@GetMapping("/all") 
	public String toAll() {
		 return "No Restrictions Zone";
	}
	
	@GetMapping("/hello") 
	public String sayHelloToCurrentUser() {
		var user =  SecurityContextHolder.getContext().getAuthentication().getName();
		return "Hello " + user;
	}
	
	@GetMapping("/admin/hello") 
	public String sayHelloToAdmin() {
		return "Hello Admin";
	}
	
	@GetMapping("/createuser") 
	@PreAuthorize("hasRole('ADMIN')")
	public String createUser() {
	    return "User created";
	}
}
