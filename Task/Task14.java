import java.io.*;
import java.util.*;
class Interest
{
   private long p;
   private long n;
   private long r;
		   long si;
  //parametrise constructor
    Interest(long p1,long n1,long r1)
     {
       p=p1;
       n=n1;
       r=r1;
    }
    public long simpleInterest(long a,long b,long c)
    {
      si=(a*b*c)/100; 
     return si;
	 }
	 public void show()
	 {
     
		 System.out.println(si);
	 }
}
class test
{
public static void main(String... args)
	{
	long p1,n1,r1;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the pricipal amount : ");
	p1=sc.nextLong();
	System.out.println("Enter the time amount : ");
	n1=sc.nextLong();
	System.out.println("Enter the rate amount : ");
	r1=sc.nextLong();
	Interest obj = new Interest(p1,n1,r1);
                obj.simpleInterest(p1,n1,r1);
	obj.show();
	}
}
