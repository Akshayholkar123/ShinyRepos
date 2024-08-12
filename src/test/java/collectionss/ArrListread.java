package collectionss;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrListread {

	public static void main(String[] args)
	{
		ArrayList a=new ArrayList();
		
          a.add("puffs");
          a.add("rsmalai");
          a.add("Rusk");
          a.add("whey");
          a.get(0);
          
          for(int i=0;i<a.size();i++)
          {
        	  System.out.println(a.get(i));
        	  
          
System.out.println(((String)(a.get(i))).length());

	}
	}
}
