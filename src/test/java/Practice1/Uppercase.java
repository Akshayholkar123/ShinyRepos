package Practice1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class Uppercase {

	public static void main(String[] args) {
/*String s="my name is akshay ";
String []a=s.split(" ");
for(int i=0;i<a.length;i++)
{
	String s1=a[i];
	System.out.print(Character.toUpperCase(s1.charAt(0))+s1.substring(1)+" "); 
	
}*/
/*		reverse("Akshay");
	}
	public static void reverse(String s)
	{
		if(s.length()>0) {
		System.out.print(s.charAt(s.length()-1));
		
		reverse(s.substring(0,s.length()-1));
	}*/
		
		/*HashMap <Character,Integer>map=new HashMap<Character, Integer>();
		String s="akshayh";
		for(int i=0;i<s.length();i++)
		{
			if(map.containsKey(s.charAt(i)))
			{
				map.put(s.charAt(i),map.get(s.charAt(i))+1);
			}
			else 
			{
				map.put(s.charAt(i),1);
				
			}
		}
		System.out.println(map);
		for(Entry<Character, Integer> data:map.entrySet())
		{
			if(data.getValue()>1)
			{
				System.out.println(data.getKey());
			}
		}*/
		//zeros right left
	/*	int []a={1,0,4,7,9,3,5,0,3,2,0,6};
		int []b=new int[a.length];
		int ind=a.length-1;

		for(int i=a.length-1;i>=0;i--)
		{
			if(a[i]!=0)
			{
				b[ind]=a[i];
				ind--;
			}

		}
		System.out.println(Arrays.toString(b));*/
		
		String s="h&el$1%09";// 9&ol$1%eh
		
		int ind=s.length()-1;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(ind))
			
		}
		
		
		
		
	}
}
