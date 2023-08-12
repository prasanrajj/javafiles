package onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "onetomany.Category")
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

	@OneToMany(mappedBy = "category", fetch = FetchType.LAZY)  // default is lazy 
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

}
