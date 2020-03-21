//Develop a program in java which calculate roots of quadratic equation ax2+bx+c=0. Use Math.sqrt() function to calculate square root.
import java.util.*;
class root
{
 public static void main(String... args)
  {
    double a,b,c,D,root1,root2,real,imaginary;
    Scanner s=new Scanner(System.in);
   System.out.print("Enter the coefficient of x*x of equation:");
    a=s.nextInt();  
    System.out.print("Enter the coefficient of y of equation:");
    b=s.nextInt();
    System.out.print("Enter the indenpendent term of equation:");
    c=s.nextInt();
    D=b*b-4*a*c;  //discriminat.
    System.out.println("Discriminat. of equation:"+D);
    if(D==0)
       {
       root1=(-b+Math.sqrt(D))/(2*a);
         System.out.println("Roots are real and equal:"+"("+root1+","+root1+")");
         }   
        else if(D>0)
           {
            root1=(-b+Math.sqrt(D))/(2*a);  
            root2=(-b-Math.sqrt(D))/(2*a);
           System.out.println("Roots are real and equal:"+"("+root1+","+root2+")");
           }
           //when D<0 roots are imaginary
           else
                {
                  real=-b/(2*a);
                  imaginary=Math.sqrt(D)/(2*a);
                 System.out.println("Roots are imaginary:"+"("+real+","+imaginary+")");
           }
   }
   }

/*
The quantity b2 - 4ac inside the radical is called discriminat.
•   If b2 - 4ac = 0, the roots are real and equal.
•   If b2 - 4ac > 0, the roots are real and unequal.
•   If b2 - 4ac < 0, the roots are imaginary.
 */
