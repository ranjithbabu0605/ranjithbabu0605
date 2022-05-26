package LearningJava;

public class JavaBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myNum = 5;
		String website = "Guru99";
		char letter = 'r';
		double decemal = 7.39;
		boolean myCard = true;
		
		System.out.println(myNum + " is the value stored in myNum variable");
		System.out.println(website + " is the value stored in website variable");
		System.out.print(letter);
		
		//Array
		int[] array1 = new int[5];
		array1[0]=1;
		array1[1]=2;
		array1[2]=3;
		array1[3]=4;
		array1[4]=5;
		
		//Shortcut to array
		int[] array2 = {5,6,7,8,9,2,10,23,45};
		System.out.println(array2[4]);

		//for loop
		//java.lang.ArrayIndexOutOfBoundsException if loop length exceeds the array length 
		for(int i=0; i<array1.length; i++)
		{
			System.out.println(array1[i]);
		}
		
		for(int i=0; i<array2.length; i++)
		{
			System.out.println(array2[i]);
		}
		
		//for loop with strings
		String[] name = {"Ranjith","Learning","Selenium"};
		
		for(int i=0; i<name.length; i++)
		{
			System.out.println(name[i]);
		}
		
		//enhanced for loop
		for (String s: name) 
		{
			System.out.println(s);
		}
		
		for (int p: array2) 
		{
			System.out.println(p);
		}
		
	}//main end

}//program end
