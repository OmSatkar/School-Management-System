package Files;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Person[] people=new Person[10];
		
		int count=0;
		
		 while (true) {
	            System.out.println("\n===== School Management System =====");
	            System.out.println("1. Add Student");
	            System.out.println("2. Add Teacher");
	            System.out.println("3. Display All");
	            System.out.println("4. Show Total Count");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");
	            int choice = sc.nextInt();
	            sc.nextLine(); // consume newline
	            
	            switch (choice) {
                case 1:
                    if (count < people.length) {
                        System.out.print("Enter student name: ");
                        String sname = sc.nextLine();
                        System.out.print("Enter age: ");
                        int sage = sc.nextInt();
                        System.out.print("Enter roll number: ");
                        int roll = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter course: ");
                        String course = sc.nextLine();

                        people[count] = new Student(sname, sage, roll, course);
                        count++;
                        School.increaseCount();
                        System.out.println(" Student added successfully!");
                    } else {
                        System.out.println(" No more space to add persons.");
                    }
                    break;

                case 2:
                    if (count < people.length) {
                        System.out.print("Enter teacher name: ");
                        String tname = sc.nextLine();
                        System.out.print("Enter age: ");
                        int tage = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter subject: ");
                        String subject = sc.nextLine();
                        System.out.print("Enter salary: ");
                        double salary = sc.nextDouble();

                        people[count] = new Teacher(tname, tage, subject, salary);
                        count++;
                        School.increaseCount();
                        System.out.println(" Teacher added successfully!");
                    } else {
                        System.out.println(" No more space to add persons.");
                    }
                    break;

                case 3:
                    System.out.println("\n--- All Persons in School ---");
                    if (count == 0) {
                        System.out.println("No data available.");
                    } else {
                        for (int i = 0; i < count; i++) {
                            
                            people[i].displayInfo();
                        }
                    }
                    break;

                case 4:
                    School.showTotalPersons();
                    break;

                case 5:
                    System.out.println(" Exiting System... Goodbye!");
                    System.exit(0);
                    break;

                default:
                    System.out.println(" Invalid choice. Try again!");
            }
	            
		 }
		

	}

}
