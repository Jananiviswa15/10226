package OrmProjects.FirstProject;

import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@DynamicUpdate//update query is framed only for the column where the val got changed
public class Person {
	
	@Id
	private int personId;
	
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", name=" + name + ", location=" + location + "]";
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	private String name;
	public void setName(String name) {
		this.name = name;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	private String location;

	
}
