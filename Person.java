package Day2;

public class Person {

	Person(){
		System.out.println("person obj");
	}
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public HouseAddress getAdrs() {
		return adrs;
	}
	public void setAdrs(HouseAddress adrs) {
		this.adrs = adrs;
	}
	private HouseAddress adrs;   //new HouseAddress() 
	
	private OfficeAddress ofcAdrs;  //new OfficeAddress();
	
	public OfficeAddress getOfcAdrs() {
		return ofcAdrs;
	}
	
	public void setOfcAdrs(OfficeAddress ofcAdrs) {
		this.ofcAdrs = ofcAdrs;
	}
	void display() {
		System.out.println(name);
		adrs.displayAdrs();
		ofcAdrs.displayAdrs();
		
	}
}
