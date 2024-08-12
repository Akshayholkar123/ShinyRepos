

public class ArrMaxSecMax {

	public static void main(String[] args) 
	{
		int a[]= {9,8,9,6,1,4,5,2,3,6,-1};
		int max=Integer.MIN_VALUE ;
		int secMax=Integer.MIN_VALUE;

		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				secMax=max;
				max=a[i];
			}
			else if(a[i]>secMax && a[i] != max)
			{
				secMax=a[i];
			}
		}
		System.out.println("second max num "+secMax);

System.out.println("max "+max);
	}

}
