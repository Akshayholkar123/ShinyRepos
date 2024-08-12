package Assignments;

import java.util.HashMap;
import java.util.HashSet;

public class P1 {

	public static void main(String[] args) 
	{
//		int a=15;
//		int b=100;
//		int max=(a<b?b:a);
//		   int min=(a>b?b:a);
//System.out.println(min+","+max);
		
		
		int []a= {13,0,10,3,5,7,6,8,7,4,9};
		HashSet<String>hs=new HashSet();
		
		for(int i=0;i<a.length;i++)
		{
			int trgSum=13;
			for(int j=i+1;j<a.length;j++)
			{
				if(trgSum==a[i]+a[j]) {
				String res = a[i] < a[j] ? "(" + a[i] + "," + a[j] + ")" : "(" + a[j] + "," + a[i] + ")";
		
			hs.add(res);
				}
			}
	}
		System.out.println(hs);
}
}