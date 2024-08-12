package ArrayProg;

public class CharArr {

	public static void main(String[] args) 
	{
		String s="Akshay";
		char[]a=s.toCharArray();
		String rev="";
		for(char d:a)
		{
			rev=d+rev;
		}
		System.out.println(rev);
		
	}

}
