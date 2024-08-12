package Assignment;

import java.util.Arrays;

public class WithLengthAndArray {

	public static void main(String[] args) 
	{
		int a[] = {2, 4, 7, 9, 1, 3, 10};
		int b[] = new int[a.length]; 
		int i;
		int j = 0;
		for (i = b.length - 1; i >=0; i--) {

                  
			b[j] = a[i];
			j++;
			 //System.out.print(a[i]+" ");
			//System.out.println(a[0]);

		}
		System.out.println(Arrays.toString(b));

	}
}

