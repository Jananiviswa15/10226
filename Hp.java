package CoreAnnotations;

public class Hp implements SystemDetails{

	
	Hp(){
		System.out.println("hi from hp");
	}
	@Override
	public void useInternet() {
		System.out.println("you can insert any sim for intermet usage");
		
	}

	@Override
	public void work() {
		System.out.println("just efficient");
		
	}

}
