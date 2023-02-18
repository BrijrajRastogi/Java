
public class MultipleArray { //creating a public class named MultipleArray with main method
	
	public void showArray() { //declaring/creating public method named showArray
		
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}}; //declaring and initializing two-dimensional array
		
		for(int i=0;i<3;i++) { //using for loop to iterate through the array and print the row
			for(int j=0;j<3;j++) { //using for loop to iterate through the array and print the column
				System.out.print(arr[i][j] + " "); //prints the 2D array
			}
			System.out.println(); //prints new row on a new line
		}
	}

	public static void main(String[] args) { //main method
		
		MultipleArray m = new MultipleArray(); //creating object of MultipleArray class with new keyword
		m.showArray(); //invoking showArray method using object

	}

}
