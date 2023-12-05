package CoreAnnotations;

public class Dell implements SystemDetails{

	
	Dell(){
		System.out.println("hi from dell");
	}
	@Override
	public void useInternet() {
		System.out.println("i can connect wireless");

	}

	@Override
	public void work() {
		System.out.println("greatly efficient");

	}

}
