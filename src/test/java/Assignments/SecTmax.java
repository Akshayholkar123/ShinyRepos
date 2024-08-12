package Assignments;

public class SecTmax {
	public static void main(String[] args) {
		
	
  int a[]= {2,5,7,10,91,4,2,-1};
  
  
  int max=Integer.MIN_VALUE;
  int secmax=Integer.MIN_VALUE;
  int tmax=Integer.MIN_VALUE;

  for(int i=0;i<a.length;i++)
  {
	  if(a[i]>max)
	  {
		  tmax=secmax;
		  secmax=max;
		  max=a[i];
	  }
	  else if(a[i]>secmax && a[i]!=max)
	  {
		  tmax=secmax;
		  secmax=a[i];
	  }
	  else if( a[i]>tmax && a[i]!=secmax && a[i]!=max)
	  {
		  tmax=a[i];
	  }
  }
  System.out.println("max "+max);
  System.out.println("secmax "+secmax);
  System.out.println("tmax "+tmax);


	}
  
}
