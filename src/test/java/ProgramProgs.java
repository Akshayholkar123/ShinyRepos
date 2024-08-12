
public class ProgramProgs{

	public static void main(String[] args)
	{
		String s="aabbbccd";
		int count=1,i;
		String op="";
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
      System.out.print(op);


	/*	for(int i=1;i<=100;i++)
		{
			if(i%3==0)
			{
				System.out.println(i+" hello");
			}
			if(i%3==0 && i%5==0)
			{
				System.out.println(i+" hello world");
			}

			else if(i%5==0)
			{
				System.out.println(i+" world");
			}
		}*/


	}

}
