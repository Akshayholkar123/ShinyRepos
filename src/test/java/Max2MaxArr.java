import java.util.Iterator;

public class Max2MaxArr {

	public static void main(String[] args)
	{
int arr[]= {24,1,2,4,6,7,9,3,-9,18};


		        
		        int []a= {99,98,12,56,34,12,67,97,95};
		        int max=Integer.MIN_VALUE;
		        int sec=Integer.MIN_VALUE;
		        for(int i=0;i<a.length;i++)
		        {
		        	if(max<a[i])
		        	{
		        		sec=max;
		        		max=a[i];
		        	}
		        	else if(sec<a[i] && max!=a[i])
		        	{
		        		sec=a[i];
		        	}
		        	
		        }
		        System.out.println("max "+max);
		        System.out.println("sec "+sec);
		        
		        
		    }
		}


	