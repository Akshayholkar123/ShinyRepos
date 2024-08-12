package StringReverse;

import java.util.HashMap;
import java.util.Map;

public class LearnEntrySet {

	public static void main(String[] args) 
	{
		HashMap<String,Integer> map=new HashMap();//is that insertion order maintained?
		map.put("sky",63);
		map.put("vk",18);
		map.put("RS",45);
		
		for(Map.Entry<String,Integer> data:map.entrySet())

		{
			System.out.print(data.getKey()+" ");
			System.out.print(data.getValue());
			System.out.println();
		}

	}

}
