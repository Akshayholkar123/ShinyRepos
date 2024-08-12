package Assignment;

public class RevArr2 {

	public static void main(String[] args) {
		String s="my name is akshay";
		String str[]=s.split(" ");
		String revs="";
		int count=0;
		for(String word:str)
		{
			count++;
			revs=word+" "+revs;
		}
		System.out.print(revs+" ");
		System.out.println();
        System.out.println(count);

	}

}
