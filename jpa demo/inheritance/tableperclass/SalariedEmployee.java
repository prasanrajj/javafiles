package inheritance.tableperclass;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity(name = "inheritance.SalariedEmployee")
@Table(name = "img2_salariedemployees")
public class SalariedEmployee extends Employee {
	protected int salary;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
