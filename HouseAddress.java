package Day2;

public class HouseAddress implements Address {

	public HouseAddress() {
		System.out.println("adrs obj");
	}
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
