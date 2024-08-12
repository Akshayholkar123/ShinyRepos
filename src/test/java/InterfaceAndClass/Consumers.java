package InterfaceAndClass;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Consumers {

	public static void main(String[] args) {
/*
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(15);
		Consumer c=(b)->System.out.println(b);
		a.forEach(c);
		
		*/
		
		ArrayList a=new ArrayList();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		Consumer c=(b)->{
			if((Integer)b%2==0) {
				System.out.println("Even");
			}
			else
				System.out.println("odd");
		};
		a.forEach(c);

	}

}
