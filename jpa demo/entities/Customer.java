package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PostLoad;
import javax.persistence.Table;

@Entity
@Table(name = "I2_CUSTOMERS")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "fullname", length = 30, nullable = false)
	private String fullname;
	@Column(name = "email", length = 30, nullable = false, unique = true)
	private String email;

	public Customer(String fullname, String email) {
		super();
		this.fullname = fullname;
		this.email = email;
	}

	public Customer() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@PostLoad
	public void postLoadProcess() {
		System.out.println("Loaded an entity!");
	}

}
