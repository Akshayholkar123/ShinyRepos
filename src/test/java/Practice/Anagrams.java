package Practice;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args)
	{
		/*String s1="ten";
		String s2="ben";
		boolean flag=true;
		if(s1.length()!=s2.length())
		{
			flag=false;
			System.out.println("not a anagram");
			return;//for stop prog
		}
		else
		{
			s1=s1.toLowerCase();
			s2=s2.toLowerCase();
			char[]ch1=s1.toCharArray();
			char[]ch2=s2.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			for(int i=0;i<ch1.length;i++)
			{
				if(ch1[i]!=ch2[i])
				{
					flag=false;
					System.out.println("Not an angram");
					break;// whenever any char not equal no need to print again
				}
			}
		}
if(flag)
{
	System.out.println("Anagrams");
}*/
		String s1="race";
		String s2="carE";
		if(s1.length()!=s2.length()) {
			System.out.println("not an anagram");
			return;
		}
		else {
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		char []ch1=s1.toCharArray();
		char []ch2=s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		boolean flag=true;
		for(int i=0;i<s1.length();i++)
		{
			if(ch1[i]!= ch2[i])
			{
				flag=false;
				System.out.println("not an anagram");
				break;
			}
			}
			if(flag)
				System.out.println("Anagram");
			}
		}
				
	}


