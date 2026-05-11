package Files;

public class Teacher extends Person{
	
	private String subject;
    private double salary;
	public Teacher(String name,int age,String subject, double salary) {
		super(name,age);
		this.subject = subject;
		this.salary = salary;
	}
	
public void displayInfo()
	{
	 System.out.println("Teachers details -->> name:"+name+"age:"+age+"Subject:"+subject+"Salary:"+salary);
	}

}
