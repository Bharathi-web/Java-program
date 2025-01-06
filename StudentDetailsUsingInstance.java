package JavaTask;

import java.util.Scanner;

public class StudentDetailsUsingInstance {
	Scanner s=new Scanner(System.in);

	//By Using instance Variable
	String stdName,stdDept; 
	int stdAge;
	
	public StudentDetailsUsingInstance() {
	System.out.println("Enter the Student's Name:" );
	stdName=s.nextLine();
	System.out.println("Enter the Student's Department:");
	stdDept=s.nextLine();
	System.out.println("Enter the Student's Age:");
	stdAge=s.nextInt();
}
	public static void main(String[] args) {
		StudentDetailsUsingInstance st=new StudentDetailsUsingInstance();
		System.out.println("The Following are the Details of Specific Student:");
		System.out.println("Student Name = "+st.stdName);
		System.out.println("Student Department = "+st.stdDept);
		System.out.println("Student Age = "+st.stdAge);
	}

}
