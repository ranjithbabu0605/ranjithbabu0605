package LearningJava;

import java.util.ArrayList;

public class Extras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Use a lamba expression in the ArrayList's forEach() method to print every item in the list:
	    ArrayList<Integer> numbers = new ArrayList<Integer>();
	    numbers.add(5);
	    numbers.add(9);
	    numbers.add(8);
	    numbers.add(1);
	    numbers.forEach( (x) -> { System.out.println(x); } );
		
	}

}
