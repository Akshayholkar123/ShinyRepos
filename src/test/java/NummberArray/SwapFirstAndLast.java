package NummberArray;

public class SwapFirstAndLast {

	public static void main(String[] args) 
	{
		String s="my name is Akshay";
		String[] a=s.split(" ");
			//String word=a[i];
			String temp=a[0];
			a[0]=a[a.length-1];
			a[a.length-1]=temp;
		for(String word:a)
			{
				System.out.print(word+" ");

		    }
	}

}
