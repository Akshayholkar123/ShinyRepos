package Assignment;

import java.util.Arrays;

public class NumArray {

	public static void main(String[] args) {
int a[]= {13,12,12,4,7,-1,9,10,5,2,11};
for(int i=0;i<a.length;i++)
{
	for(int j=0;j<a.length-1;j++)
	{
		if(a[j]<a[j+1])
		{
			int temp=a[j];
			a[j]=a[j+1];
			a[j+1]=temp;
		}
	}
}
System.out.println(Arrays.toString(a));

	}

}
