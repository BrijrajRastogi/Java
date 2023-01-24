class LogicaloprDemo{
	
	public void andOpr(){ //creating non static method 
		int a = 20;
		int b = 5;
		System.out.println("Logical And Operator");
		System.out.println((a>b)&&(a<b)); //gives output false because the second condition is false
		System.out.println((a>b)&&(b<a)); //gives output true because both the conditions are true, else false
	}
	
	public void orOpr(){ //creating non static method
		int a =20;
		int b = 5;
		System.out.println("Logical Or Operator");
		System.out.println((a<b)||(a>b)); //gives output true because one of the condition is true 
		System.out.println((a<b)||(b>a)); //gives output false because both of the conditions are false
		}
	
	public static void main(String args[]){
		
		LogicaloprDemo id = new LogicaloprDemo(); //creating object with new keyword
		id.andOpr(); //invoking andOpr method with object
		id.orOpr(); //invoking orOpr method with object
	}
}