package app.entities;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "useraccounts")
public class UserAccount {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(length = 10)
	private String username;
	@Column(length  = 10)
	private String password;
	
	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name = "user_roles" , 
           joinColumns = @JoinColumn(name = "userid"))
	private List<GrantedAuthority> authorities = new ArrayList<>();

	public UserAccount() {
		super();
	}

	public UserAccount(String username, String passwrod, String...authorities) {
		this.username = username;
		this.password = passwrod;
	    // Add authorities 
		for (var a : authorities)
			 this.authorities.add( new SimpleGrantedAuthority(a));
			     
	}

	public UserDetails asUser() {
		return User.withDefaultPasswordEncoder().username(username).password(password).authorities(authorities).build();
	}
	
	
}
