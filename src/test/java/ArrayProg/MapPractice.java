package ArrayProg;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class MapPractice {

	public static void main(String[] args)
	{
		/*String s="Welcome to banglore and Welcome to IBM";
		String s1[]=s.split(" ");
		HashMap< String,Integer> map=new LinkedHashMap();
		for(int i=0;i<s1.length;i++)
		{
			String word=s1[i];
			if(map.containsKey(word))
			{
				map.put(word,map.get(word)+1);

			}
			else
			{
				map.put(word,1);
			}
		}
		System.out.println(map);

		for(Entry<String, Integer> data:map.entrySet())
		{
          if(data.getValue()>1)
          {
        	  System.out.println(data.getKey());
          }
        
		}*/
		
		
		
		String s="a3b2c2";//aaabbcc
		String e="";
		for(int i=0;i<s.length()-1;i=i+2)
		{
			char ch=s.charAt(i);
			int count=s.charAt(i+1)-48;
			for(int j=0;j<count;j++)
			{
		e=e+ch;
			}	
	}		System.out.println(e);
	int i,count=1;//aaabbcc
	String op="";
	for(int j=0;j<e.length()-1;j++)
	{
		if(e.charAt(j)==s.charAt(j+1))
		{
			count++;
		}
		else
		{
			op=op+s.charAt(j)+count;
			count=1;
		}
		if (j==e.length()-1)
		{
			op=op+s.charAt(j)+count;

		}
	}
System.out.print(op);
	}}
