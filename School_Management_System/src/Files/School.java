package Files;

public class School {
	 private static int totalPersons = 0; // static variable

	    public static void increaseCount() {
	        totalPersons++;
	    }

	    public static void showTotalPersons() {
	        System.out.println("Total persons in school: " + totalPersons);
	    }
	

}
