
public class RevTryCatvh {

	public static void main(String[] args)
	{
		/*String ip="pyramid";
		String op="";
		int i=0;
		while(true)
		{
			try
			{
				char ch=ip.charAt(i);
				op=ch+op;
				i++;
			}
			catch(StringIndexOutOfBoundsException s)
			{
				System.out.println(i);
				break;
			}
		}
System.out.println(op);*/
		//rev try catch
		String s="pyramid";
		String op="";
		int i=0;
		while(true)
		{
			try {
				char ch=s.charAt(i);
				op=ch+op;
				i++;
			}
			catch(StringIndexOutOfBoundsException e)
			{
				System.out.println(i);
				break;
				
			}
		}
	}

}
