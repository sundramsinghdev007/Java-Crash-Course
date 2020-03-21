import java.util.*;
class Armstrong
{
 public static void main(String [] args)
{
 Scanner s=new Scanner(System.in);
 int arm=0,a,b,c,d,no;
 System.out.println("Enter the no:");
 no=s.nextInt();
  d=no;
  while(no>0)
  {
    a=no%10;
   no=no/10;
   arm=arm+a*a*a;
 }
  if(arm==d)
{
  System.out.println("Armstrong No is="+arm);
}
else
{
 System.out.println("No is not armstrong");
}
}
}