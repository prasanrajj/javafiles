package app.security;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;

import app.entities.UserAccount;
import app.entities.UserRepo;

//@Configuration
public class UserManager {

    @Bean
    public UserDetailsService userDetailsService(UserRepo userRepo) {
        return  username -> userRepo.findByUsername(username).asUser();
    } 

    @Bean 
    CommandLineRunner initUsers(UserRepo repo) {
    	return args ->  {
    	    repo.save( new UserAccount("sri", "sri", "ROLE_USER"));
    	    repo.save( new UserAccount("admin", "admin", "ROLE_ADMIN"));
    	};
    }
 
}