
public class CompressedString {

	public static void main(String[] args)
	{
		String s="aabbccad";
		int count = 1,i;//globali declared cez printing outside loop
		String op="";
		for(i=0;i<s.length()-1;i++) //<length()-1 cez following step used as i++
		{                           // so when last i++ loop it become length which give indexoutOfBoundException
			if(s.charAt(i)==s.charAt(i+1))
			{
				count++;
			}
			else
			{
				op=op+s.charAt(i)+count;// op+char +count cez integer count not directly concatinated 
				count=1;           //reinitialize count variable   //with char so used with string
			}
		}
		if(i==s.length()-1)//as in main for loop i<s.length()-1 the lasr operation is not executing
		{                     //so  by using i==s.length()-1  same cond get executed
			op=op+s.charAt(i)+count;

		}
		System.out.println(op);

	}

}
