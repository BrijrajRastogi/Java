class BitwiseOpr{
	
	public void output(){ //non static method
		
		int a = 5;
		int b = 7;
		
		System.out.println("a&b: "+(a&b)); //displays the bitwise and(&) value of a and b
		System.out.println("a|b: "+(a|b)); //displays the bitwise or(|) value of a and b
	}
	
	public static void main(String args[]){
		
		BitwiseOpr bo = new BitwiseOpr(); //creating object with new keyword
		bo.output(); //invoking output method with object
	}
}