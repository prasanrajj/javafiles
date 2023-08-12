package rest;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
  
@Entity
@Table(name = "categories")
public class Category {
	@Id
	@Column(name = "catcode")
	private String code;

	@Column(name = "catdesc")
	private String description;
	
	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@OneToMany(mappedBy = "category")  // default is lazy 
	@JsonIgnore
	private List<Product> products = new ArrayList<Product>();
	

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Category [code=" + code + ", description=" + description + "]";
	}
    
}
