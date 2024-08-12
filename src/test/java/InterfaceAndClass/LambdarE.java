package InterfaceAndClass;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdarE {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		//Consumer c=(b)->System.out.println(b);
		a.forEach((b)->System.out.println(b));

	}

}
