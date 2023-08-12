package oop2;

enum WeekDay {
	MON, TUE, WED, THU, FRI
}

class Wage {
	private WeekDay week;
	private int hours;

	public Wage(WeekDay week, int hours) {
		super();
		this.week = week;
		this.hours = hours;

		if (this.week == WeekDay.MON)
			;
	}

	public int getWage() {
		int rate = 
				switch (this.week) {
					case MON -> 100;
					case TUE -> 200;
					default -> 300;
		         };

		return rate * hours;

	}

}

public class TestEnum {

	public static void main(String[] args) {
		var w1 = new Wage(WeekDay.MON, 10);

		;
	}

}
