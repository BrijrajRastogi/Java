class TypecastingDemo{
	
	public static void main(String args[]){
		
		//widening
		int a = 10;
		long b = a;   //converting int into long implicitly
		double c = a; //converting int into double implicitly
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		//narrowing
		double x = 100.39;
		int y = (int)x; //converting double into int explicitly
		System.out.println(x);
		System.out.println(y);
	}
}