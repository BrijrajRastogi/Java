class UnaryDemo{ //creating class named UnaryDemo
	
	public void calcInc(){ //creating non static method named calcInc
		
		
		int x = 10;
		System.out.println("Increment"); 
		System.out.println(x++); //post increment //first the value of x is printed & then its value is incremented
		System.out.println(x++); //post increment //first the value of x is printed & then its value is incremented
		System.out.println(++x); //pre increment  //first the value is incremented & then the value of x is printed
		System.out.println(x++); //post increment //first the value of x is printed & then its value is incremented
		System.out.println(x);   //the latest value of x is printed
		System.out.println("....");
	}
	
	public void calcDec(){ //creating non static method named calcDec
		
		int x = 10;
		System.out.println(x--); //post decrement //first the value of x is printed & then its value is decremented
		System.out.println(x--); //post decrement //first the value of x is printed & then its value is decremented
		System.out.println(--x); //pre decrement //first the value is decremented  & then its value is printed
		System.out.println(--x); //pre decrement //first the value is decremented  & then its value is printed
		System.out.println(x--); //post decrement //first the value of x is printed & then its value is decremented
		System.out.println(x);   //the latest value of x is printed
	}
	
	public static void main(String args[]){
		
		UnaryDemo id = new UnaryDemo(); //creating object with new keyword
		id.calcInc(); //invoking calcInc method with the help of object
		id.calcDec(); //invoking calcDec method with the help of object
	}
}