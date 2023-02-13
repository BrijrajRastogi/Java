interface Sports{ //creating parent interface 1
	
	public void homeTeam(String name); //declaring method named homeTeam with parameter name of String type
	public void team(int noOfPlayers); //declaring method named team with parameter noOfPlayers of int type
}

interface Events{ // creating parent interface 2
	public void eventName(String ename); //declaring method eventName with parameter ename of String type
	public void eventDate(String edate); //declaring method eventDate with parameter edatee of String type
	public void eventPlace(String eplace); //declaring method eventPlace with parameter eplace of String type
}

class FootBall implements Sports,Events{ //creating child class named FootBall that implements parent interfaces Sports and Events
	
	public void homeTeam(String name){ 
		//name = "Mumbai";
		System.out.println("Our team is representing :" + name); //displaying team name
	}
	public void team(int noOfPlayers){
		//noOfPlayers = 11;
		System.out.println("Total no of players : " + noOfPlayers); //displaying number of players in the team
	}
	
	public void goals(int score){
		System.out.println("Total goals scored : " + score); //displaying number of goals scored by the team
	}
	
	public void eventName(String ename){
		System.out.println("Event name: " + ename); //displaying the event name
	}
	public void eventDate(String edate){
		System.out.println("Event date : " + edate); //displaying the date of the event
	}
	public void eventPlace(String eplace){
		System.out.println("Event venue : " + eplace); //displaying the venue of the event
	}
}

class Cricket implements Sports,Events{ //creating child class named Cricket that implements parent interfaces Sports and Events
	
	public void homeTeam(String name){
		//name = "Mumbai";
		System.out.println("Our team is representing :" + name); //displaying team name
	}
	public void team(int noOfPlayers){
		//noOfPlayers = 11;
		System.out.println("Total no of players : " + noOfPlayers); //displaying number of players in the team
	}
	
	public void eventName(String ename){
		System.out.println("Event name: " + ename); //displaying the event name
	}
	public void eventDate(String edate){
		System.out.println("Event date : " + edate); //displaying the date of the event
	}
	public void eventPlace(String eplace){
		System.out.println("Event venue : " + eplace); //displaying the venue of the event
	}
}

class InterfaceExample{ //creating class named InterfaceExample that contains the main method
	public static void main(String args[]){ //main method
		System.out.println("Football");
		FootBall f = new FootBall(); //creating object of FootBall class with the help of new keyword
		f.homeTeam("Mumbai Football Club"); //invoking homeTeam method with object and giving parameter
		f.team(11); //invoking team method with object and giving parameter
		f.goals(2); //invoking goals method with object and giving parameter
		f.eventName("World Cup"); //invoking eventName method with object and giving parameter 
		f.eventDate("12-12-23"); //invoking eventDate method with object and giving parameter
		f.eventPlace("India"); //invoking eventPlace method with object and giving parameter
		
		System.out.println("Cricket"); 
		Cricket c = new Cricket(); //creating object of Cricket class with the help of new keyword 
		c.homeTeam("Mumbai Indians"); //invoking homeTeam method with object and giving parameter
		c.team(11); //invoking team method with object and giving parameter
		c.eventName("Border Gavaskar Trophy"); //invoking eventName method with object and giving parameter
		c.eventPlace("Nagpur"); //invoking eventPlace method with object and giving parameter
		c.eventDate("09-02-2023"); //invoking eventDate method with object and giving parameter
	}
}