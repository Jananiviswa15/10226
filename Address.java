package OrmProjects.FirstProject;

import jakarta.persistence.Embeddable;
@Embeddable
public class Address {

	private String streetName;
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public void setDistricName(String districName) {
		this.districName = districName;
	}
	private String districName;
}
