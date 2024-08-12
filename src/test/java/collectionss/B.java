package collectionss;

import java.util.ArrayList;

public class B {

	public static void main(String[] args) {
ArrayList ls=new ArrayList();
ls.add("panipuri");
ls.add("pizza");
ls.add("manchurian");
ls.add("paneer");
ls.add(0,"burger");


Object []o=ls.toArray();
System.out.println(ls);
System.out.println(ls.contains("pizza"));//bolean
System.out.println(ls.indexOf("paneer"));//ele index
	}

}
