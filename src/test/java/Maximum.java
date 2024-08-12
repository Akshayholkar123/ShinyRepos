import java.util.Arrays;

public class Maximum {

	public static void main(String[] args) 
	{
		int []a= {1,5,9,10,3,5,7,5,-9,-18};
		//int []b =new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			//b[i]=a[i];
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			
		}
		System.out.println(Arrays.toString(a));
		System.out.println("Max ="+a[a.length-1]);
		System.out.println("2nd Max="+a[a.length-2]);
		System.out.println("Minimum="+a[0]);


		
		//System.out.println(Arrays.toString(a));
		//System.out.println(Arrays.toString(b));
	}

}
