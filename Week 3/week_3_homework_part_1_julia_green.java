// Author: Julia Green
// This program stores data from different students and displays it.

class student {
	private String fullName;
	private int id;
	private String major;
	public String courses[] = new String[4];
	
	// Sets student name
	public void setName(String studentName) {
		fullName = studentName; 
	}
	
	// Retrieves student name
	public String getName() {
		return fullName;
	}
	
	// Sets student ID
	public student(int id) {
		this.id = id;
	}
	
	// Sets student major
	public void setMajor (String studentMajor) {
		major = studentMajor; 
	}
	
	// Retrieves student major
	public String getMajor() {
		return major;
	}
	
	// Displays Student Info
	public void displayInfo() {
		System.out.println("Name: " + fullName);
		System.out.println("ID: " + id);
		System.out.println("Major: " + major);
		System.out.println("Courses: " + courses[0]);
		System.out.println("         " + courses[1]);
		System.out.println("         " + courses[2]);
		System.out.println("         " + courses[3]);
		System.out.println();
	}
} // class student end

public class main {
	public static void main(String[] args) {
		// Student 1
		int tempID1 = (int)(Math.random() * 100) + 1; // Calculates a random student ID number
		student stu1 = new student(tempID1); // Sets the random number as the student's ID
		stu1.setName("Harry Potter");
		stu1.setMajor("Wizardry");
		stu1.courses[0]="Astronomy";
		stu1.courses[1]="Defense Against the Dark Arts";
		stu1.courses[2]="Potions";
		stu1.courses[3]="Transfiguration";
		
		// Student 2
		int tempID2 = (int)(Math.random() * 100) + 1; // Calculates a random student ID number
		student stu2 = new student(tempID2); // Sets the random number as the student's ID
		stu2.setName("Hermione Granger");
		stu2.setMajor("Witchraft");
		stu2.courses[0]="Charms";
		stu2.courses[1]="Defense Against the Dark Arts";
		stu2.courses[2]="History of Magic";
		stu2.courses[3]="Potions";


		// Student 3
		int tempID3 = (int)(Math.random() * 100) + 1; // Calculates a random student ID number
		student stu3 = new student(tempID3); // Sets the random number as the student's ID
		stu3.setName("Ron Weasley");
		stu3.setMajor("Wizardry");
		stu3.courses[0]="Charms";
		stu3.courses[1]="Defense Against the Dark Arts";
		stu3.courses[2]="History of Magic";
		stu3.courses[3]="Transfiguration";
			
		// Display the students data
		stu1.displayInfo();
		stu2.displayInfo();
		stu3.displayInfo();
			
	} // main end
} // class main end