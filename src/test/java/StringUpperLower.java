
public class StringUpperLower {

	public static void main(String[] args)
	{
		String s="welcome to tp office";
		String []a=s.split(" ");
		for(int i=0;i<a.length;i++)
		{
			String words=a[i];
			//words=Character.toUpperCase(words.charAt(0))+words.substring(1);
			System.out.print(Character.toUpperCase(words.charAt(0))+words.substring(1)+" ");
			//System.out.print(words+" ");
		}

	}

}
