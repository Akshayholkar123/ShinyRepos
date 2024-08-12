package ArrayProg;

public class ReverseEachCharOfWord {

	public static void main(String[] args) {
String s="welcome to tekPyramid office";
String a[]=s.split(" ");
for(int i=0;i<a.length;i++)
{
	String word=a[i];
	for(int j=word.length()-1;j>=0;j--)
	{
		System.out.print(word.charAt(j));
	}
	System.out.print(" ");
}
	}

}
