package ArrayProg;

import java.util.Arrays;
import java.util.HashMap;

public class ShiftZeros {

	public static void main(String[] args)
	{
		/*int a[]= {2,1,4,6,3,0,2,1,0,5,0,6};
		int b[]=new int[a.length];
		int ind=a.length-1;
		for(int i=a.length-1;i>=0;i--)
		{
			if(a[i]!=0)
			{
				b[ind]=a[i];
				ind--;
			}
		}
//for(int res:b)
//{
//	System.out.print(res+" ");
//}
		System.out.println(Arrays.toString(b));*/
		
		int a[]= {21,32,0,1,2,-1,0,3,5,0,2,0};
		int b[]=new int[a.length];
	/*	int n=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				b[n++]=a[i];
			}
		}
		System.out.println(Arrays.toString(b));
		int n=a.length-1;
		for(int i=a.length-1;i>=0;i--)
		{
			if(a[i]!=0)
			{
				b[n]=a[i];
				n--;
			}
		}
		System.out.println(Arrays.toString(b));*/
		String s="akshay";
		HashMap<Character,Integer>map=new HashMap();
		for(int i=0;i<s.length();i++)
		{
		char ch=s.charAt(i);
		 if(map.containsKey(s.charAt(i))) {
			 map.put(ch,map.get(ch)+1);
		 }
		 else
		 {
			 map.put(ch, 1);
		 }
		 }
		System.out.println(map);
		
	}

}
