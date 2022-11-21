import java.util.Scanner;
/**
 * File Name: Katewa.java
 * Course: CST8284-OOP
 * Assignment: Lab 1
 * Date:15th September 2022
 * Professor: Sandra Iroakazi
 * Purpose: To take input for student details, calculating months and weeks left and display results
 * @author neeraj
 */


public class Katewa {
	public static void main(String[] args) {
		String Name;
		Computer compute=new Computer();
		long studentNumber;
		int computed_result;
		String r1,r2; 
		Scanner scan=new Scanner(System.in); //creating object of scanner class		
		System.out.println("Enter your Name:");  //asking user to enter name
		Name=scan.next();  //taking user input for name
		System.out.println("Enter your student number:");  //asking user to enter student number
		studentNumber=scan.nextInt();  //taking user input for student number
		System.out.println("Enter two reason why you picked up the course:");  //asking user to enter two reasons
		r1=scan.next();  //taking user input for reason 1
		r2=scan.next();  //taking user input for reason 2 
		computed_result=compute.compute(studentNumber);  //calling function compute() and storing returned value in computed_result
		System.out.println("Name: "+Name);  //displaying Name
		System.out.println("Student Number: "+studentNumber);  //displaying studentNumber
		System.out.println("Reasons for picking up course: "+r1+" & "+r2);  //displaying reasons
		if(studentNumber%2==0) //checking studentNumber to display months left or weeks left
			System.out.println("Months Left in 2022: "+computed_result);
		else
			System.out.println("Weeks Left in Program: "+computed_result);
		
		scan.close();
	}

}
