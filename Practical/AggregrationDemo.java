class Idproof{  //class1
	int inum;
	String city;
	String state;
	int pincode;
	String dob;
	
		Idproof(int inum, String city, String state, int pincode, String dob){ //giving parameters in constructor of Idproof class
			this.inum = inum;
			this.city = city;
			this.state = state;
			this.pincode = pincode;
			this.dob = dob;
		}
}
class Student { //class2
	
	int id;
	String name;
	String emailid;
	long contact;
	Idproof idp; //has a relationship , gave an reference of Idproof class
	
	
	Student(int id, String name, String emailid, long contact, Idproof idp){ ////giving parameters in constructor of Student class
		this.id = id;
		this.name = name;
		this.emailid = emailid;
		this.contact =contact;
		this.idp = idp;
		
	}
	
	public void show(){
		System.out.println(id +" "+name+" "+emailid+" "+contact);
		System.out.println(idp.inum+" "+idp.city+" "+idp.state+" "+idp.pincode+" "+idp.dob);
	}
}

class AggregrationDemo{ //main class 
	public static void main(String args[]){		
		Idproof i = new Idproof(101,"mumbai","mh",12345,"12-01-2000"); //creating object 
		Idproof i1 = new Idproof(1022,"hyd","tel",33345,"02-10-2001");
		Idproof i2 = new Idproof(10332,"ncr","delhi",22345,"05-05-2001");
		
	Student s = new Student(1,"brijraj","brijraj@gmail.com",98745435,i); //creating object
	Student s1 = new Student(2,"sam","sam@gmail.com",876544,i1);
	Student s2 = new Student(3,"john","jhn@gmail.com",7632141,i2);
	
	s.show(); //invoking show method with object s
	s1.show(); //invoking show method with object s1
	s2.show(); ////invoking show method with object s2
}
}