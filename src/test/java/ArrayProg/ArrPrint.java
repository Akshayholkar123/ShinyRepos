package ArrayProg;

import java.util.HashMap;

public class ArrPrint {

	public static void main(String[] args) {
int []a= {1,0,3};
int []b= {1,2,3};

for(int i=0;i<a.length;i++)
{
	if(a[i]==b[i])
	{//pull programs 
		System.out.println(a[i]+","+b[i]);
		
		
		
	}
}
HashMap<String, String> map = new HashMap<String, String>();

// Put a key-value pair into the HashMap
map.put("id", "0001");

// Retrieve and print the value associated with the key "id"
String idd=map.get("id");
System.out.println(idd);

	}

}
