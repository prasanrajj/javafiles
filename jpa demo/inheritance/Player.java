package inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("1")
public class Player extends Person {
	private String game;

	public String getGame() {
		return game;
	}

	public void setGame(String game) {
		this.game = game;
	}
	@Override
	public String toString() {
		return "Name = " + this.name + " game=" + game;
	}
	
}
