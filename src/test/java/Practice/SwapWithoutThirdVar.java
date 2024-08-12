package Practice;

public class SwapWithoutThirdVar {

	public static void main(String[] args) {
int a=10;
int b=20;
System.out.println("before sorting "+ a+" "+b);

 a=a+b; // 30
 b=a-b;  //10
 a=a-b; //20
 System.out.println("==========================");
 System.out.println("after sorting  "+ a+" "+b);
	}

}
