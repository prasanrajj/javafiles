package queries;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;

@Entity(name = "Publisher")
@Table(name = "publishers")
@SqlResultSetMapping(
   name = "pubTitleCount",  
   classes = {
      @ConstructorResult( 
          targetClass = PubTitleCount.class,
          columns = {
               @ColumnResult( name = "publisher", type = String.class),  
               @ColumnResult( name = "titleCount", type = Integer.class)
          }
      )
   } 
)
public class Publisher {

	@Id
	@Column(name = "pub_id")
	private String id;

	@Column(name = "pub_name")
	private String name;

	
	@OneToMany(mappedBy = "publisher")
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
		return "Publisher [id=" + id + ", name=" + name + "]";
	}

	

}
