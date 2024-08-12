package PatternProg;

public class NumPyramid {

	public static void main(String[] args) {
/*int n=3;
int i,j,k,l;
for(i=1;i<=n;i++)
{
	for(j=n;j>=i;j--)
	{
		System.out.print(" ");
	}
	for(k=1;k<=i;k++)
	{
		System.out.print(k);
	}
	for(l=i-1;l>=1;l--)
	{
		System.out.print(l);
	}
	System.out.println();
}*/
		
		//=================================
		int n=5;
		int i,j,k,l;
		for(i=1;i<=n;i++)
		{
			for(j=n;j>i;j--)
			{
				System.out.print(" ");
			}
			for(k=1;k<=2*i-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
