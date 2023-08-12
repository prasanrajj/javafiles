package onetomanyud;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "onetomanyud.Category")
@Table(name = "categories")
public class Category {

	@Id
	@Column(name = "catcode")
	private String code;

	@Column(name = "catdesc")
	private String description;

	 
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
