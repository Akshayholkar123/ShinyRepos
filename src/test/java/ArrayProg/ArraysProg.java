package ArrayProg;

public class ArraysProg {

	public static void main(String[] args)
	{
		/*int []a= {55,14,54,-1,23,57,98,-9,-18};
		int min=a[0];
		int secMin=a[0];
		int max=a[0];
		int secMax=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(min>a[i])
			{
				secMin=min;
				min=a[i];
			}
			else if(secMin<a[i]&& secMin!=a[i])
			{
				secMin=a[i];
			}
			
			 if(max<a[i])
			{
				secMax=max;
				max=a[i];
			}
			 else if(a[i]> secMax && secMax<max)
			 {
				 secMax=a[i];
			 }
		}
		System.out.println("second max "+secMax);
		System.out.println("max of array is "+max);
System.out.println();
		System.out.println("min of array is "+min);
		System.out.println("secMin of array is "+secMin);*/
		
		
		int max=Integer.MIN_VALUE;
		
		int Smax=Integer.MIN_VALUE;
		int []a= {1,2,3,4,5,6,7,8,9,-1};//9 8
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				Smax=max;
				max=a[i];
			}
			
			else if(Smax<a[i] && a[i]!=max)
			{
				Smax=a[i];
			}
		}

		System.out.println("Max "+max);
		System.out.println("SMax "+Smax);
	}

}
