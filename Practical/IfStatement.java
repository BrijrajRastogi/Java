class IfStatement{//declaration of class named IfStatement
	
	public static void calc(){ //creating static method
		
		int a = 30; //defining and declaring variable a
		int b = 20; //defining and declaring variable b
		if(a>b){ //simple if condition
			System.out.println("a is greater than b"); //this will be printed if the condition is true
		}
		else{
			System.out.println("a is not greater than b"); //this will be printed if the condition is false
		}
	}
	
	public static void main(String args[]){ //creating main method
		
		calc(); //calling static method without the help of an object
	}
}