package InterfaceAndClass;

public class I2Imple {

	public static void main(String[] args) {
		I2 i=(a,b) ->{

			System.out.println(a);

			System.out.println(b);

			System.out.println(a+b);

		};

		i.add(2,3);

		i.add(4,5);

	

	I2 i2=(a,b)->{

		System.out.println(a);

		System.out.println(b);

		System.out.println( a+b);

	};

	i2.add(3, 4);
	/*we can provide multiple implementation using multiple expression
we no need to implementing class
	no need to write mtd declaration 
		we can pass mtd implemention as input to another method 

*/
	}

}
