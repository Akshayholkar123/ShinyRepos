package Assignments;

import java.util.Arrays;

public class shifts {

	public static void main(String[] args)
	{
		int a[]= {2,4,6,8,1,0};
		int key=1;
		for(int k=0;k<key;k++) {
			int temp=a[0];

			for(int i=1;i<a.length;i++)
			{
				a[i-1]=a[i];


			}
			a[a.length-1]=temp;


		}
		System.out.println(Arrays.toString(a));
	}
}
