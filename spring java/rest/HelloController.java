package rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	// @GetMapping("/hello")
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello() {
		return "<h1>Hello REST</h1>";
	}

	@GetMapping("/hello/{user}")
	public String hello(@PathVariable("user") String user) {
		return "<h1>Hello " + user + "</h1>";
	}

	@GetMapping("/wish")
	public String wish(
			@RequestParam(name="user", required = false)
			String user) {
		if(user == null)
			user = "Guest";
		
		return "<h1>Hello " + user + "</h1>";
	}
	
	@GetMapping("/now")
	public String getDateTime() {
		return LocalDateTime.now().toString();
	}

}
