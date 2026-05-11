package Files;

public class Person {
	protected String name;
	protected int age;
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	
	
	public void displayInfo()
	{
		System.out.println("name:"+name+"age:"+age);
	}
	
	
	

}
