/*Accept the salary of an employee from the user. Calculate the gross salary on the following basis:
BASIC		HRA	DA
1 – 4000		10%  	50%
4001 – 8000	20%	60%
8001 - 12000  	25%	70%
12000 and above	30%	80%
*/
import java.util.*;
class employee
{
  public static void main(String... args)
  {
    Scanner s=new Scanner(System.in);
   int basic,salary;
   double HRA,DA,Gross;
   System.out.print("Enter the salary of an employee=");
   salary=s.nextInt();
   if(salary==0)
     {
		 System.out.print("Enter the right amount of salary");
	 }	   
   if(salary>=1 && salary<=4000)
     {
       HRA=(salary*10)/100;
	   DA=(salary*50)/100;
	   Gross=HRA+DA+salary;
	   System.out.print("Gross Salary="+Gross);
      }
	  else if(salary>=4001 && salary<=8000)
     {
       HRA=(salary*20)/100;
	   DA=(salary*60)/100;
	   Gross=HRA+DA+salary;
	   System.out.print("Gross Salary="+Gross);
      }
	  else if(salary>8001 && salary<=12000)
     {
       HRA=(salary*25)/100;
	   DA=(salary*70)/100;
	   Gross=HRA+DA+salary;
	   System.out.print("Gross Salary="+Gross);
      }
	  else //Salary is above the 12000
     {
       HRA=(salary*30)/100;
	   DA=(salary*80)/100;
	   Gross=HRA+DA+salary;
	   System.out.print("Gross Salary="+Gross);
      }
   }
}		
