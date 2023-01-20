class My{
	public static void display(){//static method
		System.out.println("Display Method using STATIC reference");
	}

}


class StaticReference{//start of class with main()
	
	public static void main(String args[]){//entry point
		System.out.println("Hello World");//displays on command line
		
		My.display();//classname.methodname
	}
}//end of class