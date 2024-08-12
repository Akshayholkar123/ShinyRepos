package NummberArray;

public class StringCharNum {

	public static void main(String[] args) 
	{
		String s="abcd12234&*#$@%xyz";
		String num="";
		String alpha="";
		String spechar="";
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='0' && ch<='9')
			{
				 sum+=(ch-48);
				num+=ch;
			}
			else if(ch>='a' && ch<='z' || ch>='A' && ch<='z')
			{
				alpha+=ch;
			}
			else
			{
				spechar+=ch;
			}
		}
System.out.println("number "+num);
System.out.println("alphabets "+alpha);
System.out.println("spechar "+spechar);


	}

}
