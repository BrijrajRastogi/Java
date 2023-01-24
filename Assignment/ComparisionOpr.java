class ComparisionOpr{
	
	public void display(){ //non static method
		int a = 10;
		int b = 17;
		
		System.out.println("a==b: "+(a==b)); //displays false because a is not equal to b
		System.out.println("a<b: "+(a<b)); //displays true because a is less than b
		System.out.println("a>b: "+(a>b)); //displays false because a is not greater than b
		System.out.println("a<=b: "+(a<=b)); //displays true because a is less than equal to b
		System.out.println("a>=b: "+(a>=b)); //displays false because a is not greater than equal to b
		System.out.println("a!=b: "+(a!=b));  //displays true because a is not equal to b
	}
	
	public static void main(String args[]){
		
		ComparisionOpr co = new ComparisionOpr(); //creating object with new keyword
		co.display(); //invoking display method with object
	} 
	
}