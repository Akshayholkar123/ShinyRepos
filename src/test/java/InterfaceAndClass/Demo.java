package InterfaceAndClass;

public class Demo {//implements I1

	public static void main(String[] args) {
//		Demo d=new Demo();
//		d.demo();
		I1 ref=()->{System.out.println("Hello 1") ;
		System.out.println("hello 2");
		};
		ref.demo();
		


	

//	public void demo() {
//		System.out.println("demo implemented in Demo class");
//	}

}}