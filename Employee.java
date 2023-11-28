package OrmProjects.FirstProject;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "new value")
@Table(name = "new value")
public class Employee {

	
	@Id
	//4 ways auto identity sequence table
	private int empId;
	private String name;
	
	@Column(name = "empAge")
	private int age;
	
	@Column(name = "empGender")
	private String gender;
	
	public Employee(int id, String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.empId = id;
	}
}
