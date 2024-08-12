package Assignment;

public class NoOfUperLowerSpDig {

	

		public static void main(String[] args) 
		{
			String s="abcd12234&*#$@%xyzIJK";
			int numCount=0;
			int LowerCount=0;
			int spechar=0;
			int UpperCount=0;
			for(int i=0;i<s.length();i++)
			{
				char ch=s.charAt(i);
				if(ch>='0' && ch<='9')
				{
					numCount++;
				}
				else if(ch>='A' && ch<='Z')
				{
					UpperCount++;
				}
				else if(ch>='a' && ch<='z')
				{
					LowerCount++;
				}
				else
				{
					spechar++;
				}
			}
	System.out.println("number "+numCount);
	System.out.println("lowercase "+LowerCount);
	System.out.println("spechar "+spechar);
	System.out.println("UpperCount "+UpperCount);


		}	
}
