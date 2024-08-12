import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapProg {

	public static void main(String[] args)
	{
		HashMap<String,Integer>map=new  HashMap<String, Integer>();
		String str="I am Electrical engineer and I am Software engineer";
		String s[]=str.split(" ");
		//int count=1;
		for(int i=0;i<s.length;i++)
		{
			String s1=s[i];
			if(map.containsKey(s1))
			{
				map.put(s1,map.get(s1)+1);
			}
			else
			{
				map.put(s1,1);
			}
		}
for(Map.Entry<String,Integer>data:map.entrySet())
{
	if(data.getValue()==1)
//	{
		System.out.print(data.getKey()+" ");
	}
//}*/
		
		
		/*int []a= {26,15,47,2050,-1};
		int max=0;
		int min=a[0];
		int secMax=0;

		for(int i=0;i<a.length;i++)
		{			

			if(a[i]>max)
				
			{
				secMax=max;
				max=a[i];
			}

			else if(a[i]<min)
			{
				min=a[i];

			}
			else if(a[i]<max && a[i] > secMax)
			{
				secMax=a[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
		System.out.println(secMax);
		
	/*	String s="aabbccde";
		int i,count=1;
		String op="";
		for(i=0;i<s.length()-1;i++)
		{
			char ch=s.charAt(i);
			if(s.charAt(i)==s.charAt(i+1))
			{
				count++;
			}
			else
			{
			op=op+s.charAt(i)+count;
			count=1;
			}
		}
		if(i==s.length()-1)
		{
			op=op+s.charAt(i)+count;	

		}
System.out.println(op);*/
	}

}
