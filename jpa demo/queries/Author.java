package queries;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity(name = "Author")
@Table(name = "authors")
public class Author {

	@Id
	@Column(name = "au_id")
	private String id;

	@Column(name = "au_fname")
	private String name;

	
	@ManyToMany(mappedBy = "authors")
	Set<Title> titles;
		
	
	public Set<Title> getTitles() {
		return titles;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + "]";
	}

	

}
