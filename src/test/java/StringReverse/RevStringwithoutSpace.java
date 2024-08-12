package StringReverse;

public class RevStringwithoutSpace {

	public static void main(String[] args) 
	{
		/*
		 * 1st create another string with original string without selenium
		 * get count of second string =length()-1 store in n
		 * in for loop iterate org string
		 * and if block check char is space or not if yes-
		 * print space as itis else-
		 * in else block print the char of second string from rev order
		 * and n--;
		 */

		/*String s="i love india";
		String s1=s.replace(" ","");
		int n=s1.length()-1;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				System.out.print(' ');
			}
			else
			{
				System.out.print(s1.charAt(n--));
				
			}
		}*/
		
		String s="i love india";
		String s1=s.replace(" ", "");
		int n=s1.length()-1;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				System.out.print(' ');
			}
			else
			{
				System.out.print(s1.charAt(n--));
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
