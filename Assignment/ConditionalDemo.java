class ConditionalDemo{
	
	public void calc(){ //creating non static method
	int a = 10;
	int b = 20;
	
	if(a<b){ //condition is specified in if statement
		System.out.println(a); //if the condition is true, this if block is executed
	}
	else{
		System.out.println("a is less than b"); //if the condition is false, this else block is executed 
	}
	
	}
	
	public static void main(String args[]){ //creating main method
		
		ConditionalDemo cd = new ConditionalDemo(); //creating object with new keyword
		cd.calc(); //invoking method with the help of object
	}
}