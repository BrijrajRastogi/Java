import java.util.Scanner; //importing Scanner class from util package of java language

class Else_If{ // creating class named Else_If
	
	public void calc(int marks){ //creating non-static method with parameter 
		
		if((marks >= 85)&&(marks <= 100)){//(first condition) //first this condition will be executed
			System.out.println("Grade 'O'"); //this line is printed if the first condition is true
		}
		else if((marks >= 75) && (marks <=84)){//(second condition) //this condition will be executed if the first condition is false
			System.out.println("Grade 'A++'"); //this line is printed if the second condition is true
		}
		else if((marks >= 56) && (marks <=74)){//(third condition) //this condition will be executed if the second condition is false
			System.out.println("Grade 'A'");  //this line is printed if the third condition is true
		}
		else if((marks <= 55) && (marks >= 45)){//(fourth condition) //this condition will be executed if the third condition is false
			System.out.println("Grade 'B'");  //this line is printed if the fourth condition is true
		}
		else if((marks <= 44) && (marks >= 35)){//(fifth condition) //this condition will be executed if the fourth condition is false
			System.out.println("Grade 'C'");  //this line is printed if the fifth condition is true
		}
		else if((marks <= 34) && (marks >= 0)){//(sixth condition) //this condition will be executed if the fifth condition is false
			System.out.println("Failed!!!");  //this line is printed if the sixth condition is true
		}
		else{
			System.out.println("Wrong input"); //this line is printed if the sixth condition and all the other conditions are false
		}
	}
	public static void main(String args[]){ //creating main method
		Scanner sc = new Scanner(System.in); //creating object of Scanner class to take input from the user
		System.out.println("Enter your marks: "); //this line tells the user to enter marks
		int marks = sc.nextInt();  //this line take an integer input
		
		Else_If m = new Else_If(); //creating object of Else_If class
		m.calc(marks); //invoking calc method with the help of object
	}
}