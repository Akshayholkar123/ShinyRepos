package Assignments;

import java.util.Arrays;

public class ShiftZeroRight {

	public static void main(String[] args) {
		int a[]= {2,1,4,6,3,0,2,1,0,5,0,6};
		int b[]=new int[a.length];
		int ind=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				b[ind]=a[i];
				ind++;
			}
		}
		System.out.println(Arrays.toString(b));
//for(int res:b)
//{
//	System.out.print(res+" ");
//}
//
	}

}
