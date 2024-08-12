package NummberArray;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Removeduplicate {

	public static void main(String[] args) {
		int[]a= {1,1,2,2,3,4,5,6};
		LinkedHashMap<Integer,Integer> map=new LinkedHashMap();
		//LinkedHashSet<String> set=new LinkedHashSet<>();
		for(int i=0;i<a.length;i++)
		{
			int word=a[i];
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
	        for(Entry<Integer, Integer> data :map.entrySet())
	        {
	        	if(data.getValue()==1)
	        	{
	        		System.out.print(data.getKey()+" ");// 5 2 7 1
	        	 } 
	        }
	        System.out.println();
	        for(Entry<Integer, Integer> data :map.entrySet())
	        {
	        	if(data.getValue()>1)
	        	{
	        		System.out.print(data.getKey()+" ");//1,3
	        	}
	        }
System.out.println();
for(Entry<Integer, Integer> data :map.entrySet())
{
	
		System.out.print(data.getKey()+" ");// 1 3 5 2 7 8
	}
	}

}
