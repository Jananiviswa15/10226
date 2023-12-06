package Day2;

public class OfficeAddress implements Address{
	OfficeAddress(){System.out.println("office obj created..");}
	
	private int doorNum;
	private String street;
	public int getDoorNum() {
		return doorNum;
	}
	public void setDoorNum(int doorNum) {
		this.doorNum = doorNum;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	
	public void displayAdrs() {
		System.out.println(doorNum +" "+ street);
	}

}
