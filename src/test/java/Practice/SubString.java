package Practice;

public class SubString {

	public static void main(String[] args)
	{
		//String s="sum";
		String s="india";
		for(int i=0;i<s.length();i++)//outer for loop for constant i
		{
			//inner for loop is for i+1 start from next char
			for(int j=i+1;j<=s.length();j++)//cez start from next char every time
			{
				System.out.println(s.substring(i,j)+" ");
			}
		}

	}
 
}
