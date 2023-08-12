package onetoone.sharedpk;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity(name = "onetoone.sharedpk.Employee")
@Table(name = "I2_OTO_SPK_EMPLOYEES")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "emp_id")
	private int id;

	@Column(name = "emp_name", length = 30, nullable = false)
	private String name;

	@OneToOne(mappedBy="employee", cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private Project project;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}
	
	

}
