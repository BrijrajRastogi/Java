class Chocolate{  //creating class named Chocolate
	
	//creating data members as private to implement encapsulation
	
	private int cprice;
	private String cname;
	private String cflavour;
	
	public int getCprice(){ //creating getCprice method that is a getter method which returns cprice
		return cprice; //returns cprice 
	}
	
	public void setCprice(int cprice){  //creating setCprice method with cprice parameter which is a setter method
		this.cprice = cprice; 
	}
	
	public String getCname(){ //creating getCname method that is a getter method which returns cname
		return cname; //returns cname
	}
	
	public void setCname(String cname){ //creating setCname method with cname parameter which is a setter method
		this.cname = cname;
	}
	
	public String getCflavour(){ //creating getCflavour method that is a getter method which returns cflavour
		return cflavour; //returns cflavour
	}
	
	public void setCflavour(String cflavour){ //creating setCflavour method with cflavour parameter which is a setter method
		this.cflavour = cflavour;
	}
}

class Encapsulation_Demo{ //creating class named Encapsulation_Demo which contains main method
	
	public static void main(String args[]){ //main method
		
		Chocolate c = new Chocolate(); //creating object of Chocolate class
		c.setCprice(20); //setting parameter for setCprice method by calling method with help of object
		c.setCname("Hershey`s"); //setting parameter for setCname method by calling method with help of object
		c.setCflavour("Mango"); //setting parameter for setCflavour method by calling method with help of object
		
		System.out.println("Chocolate price: " + c.getCprice());  //displaying chocolate price by calling method with help of object
		System.out.println("Company Name: " + c.getCname());  //displaying company name by calling method with help of object
		System.out.println("Chocolate flavour: " + c.getCflavour());  //displaying chocolate flavour by calling method with help of object
	}
}