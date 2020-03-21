//Write a program to find volume and surface of cuboid
/* v=l*b*h;
sa=2*(l*b+b*h+h*l)
*/
/** block comment*/


import java.util.Scanner;
class Cuboid
{
 public static void main(String [] agrs)
 {
int l,b,h,v,sa;
    Scanner s=new Scanner(System.in);
System.out.println("Enter the length");
 l=s.nextInt(); 
System.out.println("Enter the breadth");
 b=s.nextInt(); 
System.out.println("Enter the height");
 h=s.nextInt(); 
 System.out.pr intln("Volume Of Cubid="+l*b*h);
 System.out.println("Surface area of cuboid="+2*(l*b+b*h+h*l));
 }
}

