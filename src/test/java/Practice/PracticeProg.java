package Practice;

public class PracticeProg {

	public static void main(String[] args)
	{
		//compresed string
		/*String s="abbcccad";
		int count=1;
		String op="";
		int i;

		for(i=0;i<s.length()-1;i++)
		{		

			if(s.charAt(i)==s.charAt(i+1))
			{
				count++;
			}
			else
			{
				op=op+s.charAt(i)+count;
				count=1;
			}

		}
		if(i==s.length()-1)
		{
			op=op+s.charAt(i)+count;

		}

		System.out.println(op);*/
		/*String s="My name is akshay";
		String a[]=s.split(" ");
		String temp=a[0];
		a[0]=a[a.length-1];
		a[a.length-1]=temp;
		for(String word:a)
		{
			System.out.print(word+" ");
		}*/
		//1st chqar of each word to upper case
		/*String s="welcome to tp office";
		String []a=s.split(" ");
		for(int i=0;i<a.length;i++)
		{
			String word=a[i];
		System.out.print((Character.toUpperCase(word.charAt(0))+word.substring(1))+" ");	
		}
		*/
		
		String s="welcome to tp office";
		String []a=s.split(" ");
		for(int i=0;i<a.length;i++)
		{
			String word=a[i];
			System.out.print((Character.toUpperCase(word.charAt(0))+word.substring(1))+" ");
		}
		
	}


}
