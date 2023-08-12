package queries;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "titles")
@NamedQuery(name = "CostlyTitles", query = "from Title where price > 15")
public class Title {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "title_id")
	private String id;

	@Column(name = "title")
	private String title;
	
	@Column(name = "price")
	private Double price;
	
	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="pub_id")
	private Publisher publisher;
	
	@ManyToMany
	@JoinTable(
			  name = "titleauthor", 
			  joinColumns = @JoinColumn(name = "title_id"), 
			  inverseJoinColumns = @JoinColumn(name = "au_id"))
    Set<Author> authors;
	

	public Set<Author> getAuthors() {
		return authors;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return String.format("%s - %s - %f", this.id, this.title, this.price == null ? 0 : this.price);
	}

}
