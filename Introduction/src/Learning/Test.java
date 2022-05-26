package Learning;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name1 = "peek";
		String name2 = "keep";
		char a,b;
		int k=0;
		if (name1.length()==name2.length())
		{
			for(int i=0;i<name1.length();i++)
			{
				for(int j=0;j<name2.length();j++)
				{
					int l=0;
					a=name1.charAt(i);
					b=name2.charAt(j);
					if (a==b && j<=name2.length())
					{
						l=l+1;
						if (l<1)
						{
							System.out.println("It is an anagram");
							k=k+1;
							break;
						}
						

					}
					
				}
			}
			if(k==name1.length())
				System.out.println("It is an anagram");
			else
				System.out.println("Not an anagram");
		}
		else
		{
			System.out.println("Not an anagram");
		}
		
	}

}
