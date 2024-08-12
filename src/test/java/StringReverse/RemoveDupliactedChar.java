package StringReverse;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class RemoveDupliactedChar {

	public static void main(String[] args) {
		String s="india";
        HashMap<Character, Integer> map = new LinkedHashMap();
       // LinkedHashSet set=new LinkedHashSet();
        for(int i=0;i<s.length();i++)
        {
        	char ch=s.charAt(i);
        	if(map.containsKey(ch))
        	{
        		map.put(ch,map.get(ch)+1);
        	}
        	else {
        		map.put(ch,1);
        	}
        }
        
        
        //System.out.println(map);
        for(Map.Entry<Character,Integer> data :map.entrySet())
        {
        	
        		System.out.print(data.getKey());
        	
        }
		
		

	}

}
