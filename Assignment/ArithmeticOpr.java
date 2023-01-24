class ArithmeticOpr{
	
	public void display(){ //non static method
		
		int a = 2;
		int b = 4;
		
		System.out.println("a+b: "+(a+b)); //displays addition of a and b
		System.out.println("a-b: "+(a-b)); //displays subtraction of a and b
		System.out.println("a*b: "+(a*b)); //displays multiplication of a and b
		System.out.println("a/b: "+(a/b)); //displays division of a and b
		System.out.println("a%b: "+(a%b)); //displays modulus of a and b
		System.out.println("a++: "+(a++)); //first displays the value of a and then increments its value
		System.out.println("a--: "+(a--));//first displays the value of a and then decrements its value
		System.out.println("b++: "+(b++)); //first displays the value of b and then increments its value
		System.out.println("b--: "+(b--)); //first displays the value of b and then decrements its value
	}
	
	public static void main(String args[]){
		
		ArithmeticOpr ao = new ArithmeticOpr(); //creating object with new keyword
		ao.display(); //invoking display method with object
	}
}