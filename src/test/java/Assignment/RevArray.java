package Assignment;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RevArray {

	public static void main(String[] args) 
	{
		
			String s = "welcome to tp and welcome to gc18";
			String[] strArray = s.split(" ");
			List<String> strList = Arrays.asList(strArray);

			String reversed = "";

			Iterator<String> itr = strList.iterator();
			while (itr.hasNext()) {
				//String current = itr.next();
				reversed = itr.next() + " " + reversed;
			}

			System.out.println(reversed.trim());
		}


	

}
