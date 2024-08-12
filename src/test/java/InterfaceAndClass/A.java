package InterfaceAndClass;

public abstract class A implements I3 {

	public static void main(String[] args) {
		I3 ref=(a,b)->{
			return a+b;
		};
		System.out.println(ref.add(2,3));
	}


}
