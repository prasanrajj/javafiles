package compositePk;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "compositePk.TitleAuthor")
@Table(name = "TitleAuthor")
public class TitleAuthor {
	@EmbeddedId
	private TitleAuthorPK key;

	@Column(name = "au_ord")
	private int order;

	public TitleAuthorPK getKey() {
		return key;
	}

	public void setKey(TitleAuthorPK key) {
		this.key = key;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

}
