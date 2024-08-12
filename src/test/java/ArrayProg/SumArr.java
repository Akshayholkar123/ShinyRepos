package ArrayProg;

import java.util.Arrays;

public class SumArr {

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4};
		int b[]= {4,5,6,7,8};
		int sum[]=new int[Math.max(a.length,b.length)];
		for(int i=0;i<sum.length;i++)
		{
			if(i<a.length)
			{
				sum[i]=sum[i]+a[i];
			}
			if(i<b.length)
			{
				sum[i]=sum[i]+b[i];
			}

		}
System.out.println(Arrays.toString(sum));
	}

}
