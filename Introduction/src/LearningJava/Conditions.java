package LearningJava;

import java.util.ArrayList;

public class Conditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array2 = {1,2,3,4,5,6,22,32,4,5,45,21,3};
		//print only if divisible by 2
		for(int i=0; i<array2.length; i++)
		{
			if (array2[i] % 2 ==0)
			{
				System.out.println(array2[i] +" is divisible by 2");
			}
			else
			{
				System.out.println(array2[i]+" is not divisible by 2");
			}
		}
		
		// Using break statement(Does this array have numbers divisible by 2)
		for(int i=0; i<array2.length; i++)
		{
			if (array2[i] % 2 ==0)
			{
				System.out.println(array2[i] +" is divisible by 2");
				break;
			}
		}
		
		//Array list (dynamic array can change size of array during run time)
		//Array list is a class//
		ArrayList<String> a = new ArrayList<String>();
		a.add("Ranjith");//add the value to the list
		a.add("Learns");
		//a.remove(0);//Remove the values of the 0th index
		a.get(0);//get the value of the array list in the 0th index
		System.out.println(a.get(0));
//		System.out.println(a.lastIndexOf(array2));
		
		
	}//Main method
	
}//Class close
