package ArrayProg;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapWord {

	public static void main(String[] args) {
String s="welcome to tp and welcome to tp18";
String str[]=s.split(" ");
HashMap<String,Integer> map= new HashMap<String, Integer>();
for(int i=str.length-1;i>=0;i--)
{
//	System.out.print(str[i]+" ");
	String word=str[i];
	if(map.containsKey(word))
	{
		map.put(word,map.get(word)+1);
	}
	else
	{
	map.put(word,1);	
	}
	
}
for(Map.Entry<String, Integer> data:map.entrySet())
{
	//System.out.println(data.getKey());

	if(data.getValue()>1)
	{
		System.out.print(map);
		//System.out.println(data.getKey());
	}
}
	}

}
