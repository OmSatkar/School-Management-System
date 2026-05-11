package Files;


public class Student extends Person {
	 private int rollNo;
	 private String course;
	 
	 public Student(String name, int age,int rollNo, String course) {
		super(name, age);
		this.rollNo = rollNo;
		this.course = course;
	 }
	 
	 @Override
	public void displayInfo() {
		 System.out.println("Students details -->> name:"+name+"age:"+age+"roll_no:"+rollNo+"course:"+course);
		 
	 }
	 

}
