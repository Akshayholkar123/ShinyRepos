package InterfaceAndClass;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Prime {

	public static void main(String[] args) 
	{
		ArrayList a=new ArrayList();
		int d[]= {2,3,4,5,6,7};
		a.add(1);
		a.add(2); 
		a.add(3);
		a.add(4);
		a.add(5);
		Consumer c=(b)->{
			int count=0;
				for(int i=0;i<d.length;i++)
				{
					if((Integer)b%2==0) {

					count++;}
				if(count==0)
					System.out.println("prime");
		
				}
			else
				System.out.println("not prime");

			
		};
		a.forEach(c);


	}

}
