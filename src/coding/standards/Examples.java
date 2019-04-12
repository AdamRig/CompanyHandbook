//package name
package coding.standards;

// import example
import java.util.ArrayList;

//class name
public class Examples {
	
	//declare local variables
	private static int a = 1;
	private static int b = 2;
	private static int c = 3;

	private static ArrayList<Integer> myList = new ArrayList<>(3);
	
	public static void main(String[] args) {

		// begin if statement
		if(myList != null) {
			
			displayList();
			
		} 
		else {
			
			System.out.println("The list is empty");
		}

       
    }

	// method
	private static void displayList() {
		
		myList.add(a);
        myList.add(b);
        myList.add(c);

        System.out.println(myList);
		
	}

}
