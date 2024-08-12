package StringReverse;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class UsingSet {

	public static void main(String[] args) {
		String s="india";
        LinkedHashSet<Character> set=new LinkedHashSet();
        for(int i=0;i<s.length();i++)
        {
        	char ch=s.charAt(i);

        	set.add(ch);
        }

        for(Character o:set)
        {
        	
        		System.out.print(o);
        	
        }
		

	}

}
