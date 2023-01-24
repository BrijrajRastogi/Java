class TernaryOpr{
	
	public static void display(){ //static method
		
		int a = 19;
		int b = 20;
		int c = (a > b)? a : b; //displays the value of a if a is greater than b else displays value of b
		System.out.println(c); //prints the value of c
	}
	
	public static void main(String args[]){
		
		display(); //invoking method without object
	}
}