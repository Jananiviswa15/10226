package OrmProjects.FirstProject;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity(name = "new value")
@Table(name = "new value")
public class Employee {

	
	@Id
	//4 ways auto identity sequence table
	private int empId;
	
	@Column(nullable = false)  //not null
	private String name;
	
	//private String streetName;
	//private String districName;
	
	//@Embedded
	private Address adrs;
	@Column(unique = true)
	private String emailId;
	
	@Transient
	private int salary;
	
	
	@Column(name = "empAge")
	private int age;
	
	@Column(name = "empGender")
	private String gender;
	
	public Employee(int id, String name, int age, String gender, String emailId) {
		super();
		this.emailId = emailId;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.empId = id;
	}
}
