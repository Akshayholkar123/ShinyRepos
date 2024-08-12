package ArrayProg;

public class RepeatedPositions {

	public static void main(String[] args)
	{
		int a[]= {3,6,1,9,4,7,8,6,3,9};
		
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			boolean flag=true;
			String s=a[i]+"- ";

			for(int j=0;j<a.length;j++)
			{
			if(a[i]==a[j])
			{				
				if(j<i)
				{
				flag=false;
				break;
				}
				else if(i!=j)
				{
					s=s+j+", ";
					count++;
				}
			}
		}
			if(flag && count>0)
			{
				System.out.println(s);
			}

	}

}}
