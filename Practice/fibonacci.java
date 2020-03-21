/*Fibonacci Series 
0 1 1 2 3 5.......................... */

import java.util.*;
class FS
{
 public static void main(String [] args)
 {
  int t1=0,t2=1,t3,i,n;   
  Scanner s=new Scanner(System.in);
  System.out.print("How many terms you want in series ?");
  n=s.nextInt(); 
  System.out.print(t1+"\t"+t2+'\t');
  for(i=1;i<=n-2;i++)
  {
   t3=t1+t2;
  System.out.print(t3+"\t");
  t1=t2;
  t2=t3;
  }
}
}