package CoreAnnotations;

public class Student {

	
	private String name;
	
	Student(){}
	public Student(String name) {
		super();
		this.name = name;
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	private int age;

	/*
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("age setter invoked");
		this.age = age;
	}

	String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setter invoked");
		this.name = name;
	}
*/
	void display() {
		System.out.println("name of the student..."+name+"   "+age);
	}
}
