
public class SingleArray { //creating a public class named SingleArray with main method

	public static void main(String[] args) { //main method
		
		int myarray[] = new int[5]; //declaring, instantiating a single array of 5 elements
		myarray[0] = 20; //initializing value for element on index 0 
		myarray[1] = 30; //initializing value for element on index 1
		myarray[2] = 40; //initializing value for element on index 2
		myarray[3] = 50; //initializing value for element on index 3
		myarray[4] = 60; //initializing value for element on index 4
		
		System.out.println("Element at 0 index is: " + myarray[0]); //printing element present at index 0
		
		for(int i=0;i<myarray.length;i++) { //using for loop to iterate through the array
			System.out.println(myarray[i]); //printing all the elements present in the array
		}
		
		float array2[] = {1.2f,2.3f,4.5f,6.7f}; //declaring and initializing array of float data type
		
		for(float j:array2) { //using for each loop to iterate through float array
			System.out.println(j); //printing float array
		
		}
	}

}
