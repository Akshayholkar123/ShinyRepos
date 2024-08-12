package ArrayProg;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;


public class RemoveDuplicateFromArray {

	public static void main(String[] args)
	{
		String s="welcome to tp and welcome to gc18";
		String str[]=s.split(" ");
		HashMap<String,Integer> map=new LinkedHashMap();
		//LinkedHashSet<String> set=new LinkedHashSet<>();
		for(int i=0;i<str.length;i++)
		{
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
		for(Entry<String, Integer> data :map.entrySet())
		{
			if(data.getValue()==1)
			{
				System.out.print(data.getKey()+" ");
			}
		}




	}

}
