import java.util.*;
class BinaryToDecimal
{
  int dec=0;
  public int BtoD(int n)
   {
     int i,v;
    int length=String.valueOf(n).length();
    for(i=0;i<length;i++)
            {
	  if(n==0)
	     {
	       System.out.print("Enter the valid number");
	       }
	  else
	         {
	            v=n%10;
	            dec+=v*Math.pow(2, i);
	             n=n/10;
	         }
	    }
  return dec;
}
 }
class task
{
     public static void main(String... args)
            {
	int Bno,sum;
	BinaryToDecimal d = new BinaryToDecimal();
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the binary number=");
                Bno=sc.nextInt();
	sum=d.BtoD(Bno);
   	System.out.print(sum);
              }
}
