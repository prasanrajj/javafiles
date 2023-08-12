package onetoone.sharedpk;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name  ="onetoone.sharedpk.Project")
@Table(name = "I2_OTO_SPK_PROJECTS")
public class Project {
	@Id
	@Column(name = "emp_id")
	private int id;

	@Column(name = "project_title", length = 30, nullable = false)
	private String title;

	@OneToOne
	@MapsId  // Take primary key from Employee entity 
	@JoinColumn(name = "emp_id")
	private Employee employee;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
