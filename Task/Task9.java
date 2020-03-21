/*Write a Java program to accept a figure code and find the areas of
different geometrical figures such as circle, square, rectangle etc.
using switch.*/
import java.util.*;
class FindArea
{
  public static void main(String... args)
  {
   Scanner s=new Scanner(System.in);
    double a,b,h;
    double pie=3.14159,Area,angle;
    int n; //N is for case number
    System.out.println("Enter 1 for Triangle");
    System.out.println("Enter 2 for Square");
    System.out.println("Enter 3 for Rectangle");
    System.out.println("Enter 4 for Parallelogram");
    System.out.println("Enter 5 for Trapezoid");
    System.out.println("Enter 6 for Circle");
    System.out.println("Enter 7 for Ellips");
    System.out.println("Enter 8 for Sector");
    n=s.nextInt();
      switch(n)
      {
        case 1:
                   System.out.print("Enter the base:");
                   b=s.nextDouble();
	   System.out.print("Enter the height:");
                   h=s.nextDouble();
                   Area=(b*h)/2;
	   System.out.print("Area of Triangle="+Area+"  unit^2");
         break;
         case 2:
                   System.out.print("Enter the side of square:");
                   a=s.nextDouble();
	   Area=(a*a);
	   System.out.print("Area of Square="+Area+"  unit^2");
         break;
         case 3:
                   System.out.print("Enter the height of rectangle:");
                   h=s.nextDouble();
	   System.out.print("Enter the width of rectangle:");
                   b=s.nextDouble();
	   Area=(h*b);
	   System.out.print("Area of Rectangle="+Area+"  unit^2");
         break;
         case 4:
                   System.out.print("Enter the height of parallelogram:");
                   h=s.nextDouble();
	   System.out.print("Enter the width of parallelogram:");
                   b=s.nextDouble();
	   Area=(h*b);
	   System.out.print("Area of Parallelogram="+Area+"  unit^2");
         break;
         case 5:
                   System.out.print("Enter the distance across the top:");
                   a=s.nextDouble();
	   System.out.print("Enter the distance across the base:");
                   b=s.nextDouble();
	   System.out.println("Enter the value of vertical height:");
	    h=s.nextDouble();
	   Area=((a+b)*h)/2;
	   System.out.print("Area of Trapezoid="+Area+"  unit^2");
         break;
         case 6:
                   System.out.print("Enter the radius of circle:");
                   a=s.nextDouble();
	   Area=pie*a*a;
	   System.out.print("Area of Circle="+Area+"  unit^2");
         break;
         case 7:
                   System.out.print("length of semi-minor axis:");
                   a=s.nextDouble();
	   System.out.print("length of semi-major axis:");
                   b=s.nextDouble();
	   Area=(a*b*pie);
	   System.out.print("Area of Ellipse="+Area+"  unit^2");
         break; 
         case 8:
                   System.out.print("Enter the radius:");
                   a=s.nextDouble();
	   System.out.print("Enter the value of angle in radian(1 degree=0.0175 radian):");
                   b=s.nextDouble();
	   Area=(a*b*pie);
	   System.out.print("Area of Sector="+Area+"  unit^2");
         break;
      }  
   }
}
