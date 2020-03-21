import java.util.Scanner;
class Rectangle
{
 public static void main(String [] args)
{
 Scanner s=new Scanner(System.in);
 int l,b,a,p;
 System.out.println("Enter the Lenght");
 l=s.nextInt();
System.out.println("Enter the breadth");
 b=s.nextInt();
 a=l*b;
 p=2*(l+b);
 System.out.println("Area="+a);
 System.out.println("Parimeter="+p);
}
}