package Assignment;

public class LengthOfArrayEWithoutLength {

	public static void main(String[] args) {
		String ip="welcome to tek pyramid";
		String []a=ip.split(" ");
		int i=0;
//		String op="";
		while(true)
		{
			try
			{
//				String word=a[i];
				//op=word+" "+op;
				i++;
			}
			catch(ArrayIndexOutOfBoundsException s)
			{
				System.out.println(" length of a array is "+i);
				break;
			}
		}
//System.out.println( op); //pyramid tek to welcome 


	}

}
