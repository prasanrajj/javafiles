package compositePk;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

// Primary Key Class 
@Embeddable
public class TitleAuthorPK  implements Serializable {
	@Column(name = "au_id")
	private String authorId;
	@Column(name = "title_id")
	private String titleId;

	public TitleAuthorPK(String authorId, String titleId) {
		super();
		this.authorId = authorId;
		this.titleId = titleId;
	}

	public TitleAuthorPK() {
		super();
	}

	@Override
	public int hashCode() {
		return Objects.hash(authorId, titleId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TitleAuthorPK other = (TitleAuthorPK) obj;
		return Objects.equals(authorId, other.authorId) && Objects.equals(titleId, other.titleId);
	}

	public String getAuthorId() {
		return authorId;
	}

	public void setAuthorId(String authorId) {
		this.authorId = authorId;
	}

	public String getTitleId() {
		return titleId;
	}

	public void setTitleId(String titleId) {
		this.titleId = titleId;
	}
	
	

}
