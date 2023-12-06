package Day2;

public class PersonRunTime {

	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	PersonRunTime(){
		System.out.println("person obj s created");
	}
	
	private Address adrsRuntime; //new HouseAddress / new OfficeAddress()

	public Address getAdrsRuntime() {
		return adrsRuntime;
	}

	public void setAdrsRuntime(Address adrsRuntime) {
		this.adrsRuntime = adrsRuntime;
	}
	
	void display() {
		System.out.println(name);
		adrsRuntime.displayAdrs();
	}
	
	
}
