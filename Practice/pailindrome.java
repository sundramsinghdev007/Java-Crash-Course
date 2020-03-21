//Palindrom 

import java.util.Scanner;
class palindrome
{
  public static void main(String [] args)
  {
   int no,a,b,temp=0;
   Scanner s=new Scanner(System.in);
   System.out.println("Enter any number:");
   no=s.nextInt();
   a=no;
   while(no>0)
    {
      b=no%10;
      no=no/10;
      temp=temp*10+b;
     }
     if(temp==a)
     {
       System.out.println("Yes");
      }
      else
       {
         System.out.println("No");
         }
   }
 }