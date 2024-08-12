import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateSetArr {

	public static void main(String[] args) 
	{
		//max and second max
		int []a= {1,5,2,7,9,6};
		int max=0;
		int secMax=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				secMax=max;

				max=a[i];
			}
			 if(secMax >a[i] &&secMax < max)
			{
			}
		}
		System.out.println("second max -"+secMax);

		System.out.println("maximum -"+max);
		
		
		
		
		
		
		
		
		
		
		
		
     /*int []a= {1,2,1,4,3,2,5};
     int []b= new int[a.length];
     
     for(int i=0;i<a.length;i++)
     {
         b[i] = a[a.length - 1 - i];
     }
     System.out.println(Arrays.toString(b));*/
     
     
     
     
//     HashSet<Integer> set=new HashSet<>();
//     for(int i=0;i<a.length;i++)
//     {
//    	 set.add(a[i]);
//     }
//	 System.out.println(set);

	}

}
