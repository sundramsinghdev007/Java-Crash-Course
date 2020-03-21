// Calculation of electricity bill
/* 
1-150                                2.40/unit
for next 151-300               3.00/unit
for next more than 300     3.20/unit
*/

import java.util.Scanner;
class p6
{
  public static void main(String [] args)
  {
   int unit;
   double bill;
   Scanner s=new Scanner(System.in);
   System.out.println("Enter The No Of Units Consume");
   unit=s.nextInt(); 
   if(unit<=150)
     {
      bill=(unit*2.40);
      }
       else if(unit>150&&unit<=300)
          {
           bill=(150*2.40)+(unit-150)*3.00;
            }
             else
	   {
	      bill=(150*2.40)+(150*3.00)+(unit-300)*3.20;
	     }
       System.out.println("The Bill="+bill);      
   }
}