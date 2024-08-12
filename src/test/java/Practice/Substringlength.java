package Practice;

public class Substringlength {

	public static void main(String[] args)
	{
		String s="india";
		for(int i=0;i<s.length();i++)
{
			for(int j=i+1;j<=s.length();j++)
			{
				if(s.substring(i,j).length()>2)
				{
					System.out.println(s.substring(i,j));
				}
			}
	
}

	}

}
