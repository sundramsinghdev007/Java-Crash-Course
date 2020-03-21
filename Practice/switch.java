//Write a program in java to make simple calculator using switch
import java.util.Scanner;
class calculator
{
  public static void main(String [] args)
 {
  Scanner s=new Scanner(System.in);
  double n1,n2,res;
  int ch;
  System.out.println("Enter First No n1=");
  n1=s.nextDouble(); 
  System.out.println("Enter Second No n2=");
  n2=s.nextDouble();
  System.out.println("Enter  1 for addition=");
  System.out.println("Enter  2 for substraction=");
  System.out.println("Enter  3 for multipication=");
  System.out.println("Enter  4 for Divison=");
   ch=s.nextInt();
      switch(ch) 
      {
       case 1:
	res=n1+n2;
       System.out.println("Addition is="+res);
       break;
       case 2:
	res=n1-n2;
       System.out.println("Substraction is="+res);
       break;
       case 3:
	res=n1*n2;
       System.out.println("Substraction is="+res);
       break;
       case 4:
	res=n1/n2;
       System.out.println("Division is="+res);
       break;
        default:
                     System.out.println("Enter Wrong Choice");
        break; 
      }
   }
}