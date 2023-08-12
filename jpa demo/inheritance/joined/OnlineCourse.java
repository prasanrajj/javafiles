package inheritance.joined;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "img2_onlinecourses")
public class OnlineCourse extends Course {
	private String url;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	 

}
