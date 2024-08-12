import java.util.Scanner;

public class Amount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the line here");
		String input =sc.nextLine();

		System.out.println("enter amout to be added");
		int addamount=sc.nextInt();
		int amount = Integer.parseInt(input.replaceAll("\\D+", ""));

		int updatedAmount = amount + addamount;

		System.out.println("I have " + updatedAmount + " rs");
	}
}
//String []a=input.split(" ");
//for(int i=0;i<a.length;i++)
//{
//	if(a[i]==isDigit)
//}
