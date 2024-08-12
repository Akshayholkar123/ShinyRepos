import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args)
	{
		/* String s = "my name is akshay";
        String[] a = s.split(" ");
        int key = 3;

        for (int j = 0; j < key; j++) {
            String temp = a[0];

            for (int i = 0; i < a.length - 1; i++) {
                a[i] = a[i + 1];
            }
            a[a.length - 1] = temp;
        }

        System.out.println(Arrays.toString(a));*/

		/*	String s="My name is Akshay";
		String a[]=s.split(" ");
		int key =4;
		for (int i=0;i<key;i++)
		{
			String temp=a[0];
			for(int j=0;j<a.length-1;j++)
			{
				a[j]=a[j+1];
			}
			a[a.length-1]=temp;

		}
		System.out.println(Arrays.toString(a));*/
		//repaeted position
		int a[]= {6,3,2,1,5,6,7,1,3,5,2,6};


		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{   
				int count=0;
				String 	s=a[i]+"-";		
				boolean flag=true;
				if(a[i]==a[j])
				{
					if(j<i)
					{
						flag=false;
						break;
					}
					if(i!=j)
					{
						s=s+j+", ";
						count++;
					}
				}
		
			if(flag && count >0)
			{
				System.out.println(s);
				
			}
	}

		}

























	/* int a[]={2,5,1,6,9,-1,7};
        int min=0;
        int secmin=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<min)
            {
                secmin=min;
                min=a[i];
            }
            else if(a[i]<secmin && a[i]!=min)
            {
                secmin=a[i];
            }
        }
        System.out.println("min "+min);
        System.out.println("secmin "+secmin);*/




}

}
