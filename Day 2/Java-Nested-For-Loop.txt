import java.util.Scanner;
class rhombus
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int i,j,k,n;
		System.out.println("Enter the number of rows");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=n;j++)
			{
				if(i==1 || j==1 ||i==n ||j==n)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(i=1;i<=n;i++)
		{
			for(k=n;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(j=1;j<=n;j++)
			{
				if(i==1 || j==1 || j==n || i==n)
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("\n");
	
	}
}
