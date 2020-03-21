import java.util.Scanner;
class Cuboid
{
 public static void main(String [] args)
{
 Scanner s=new Scanner(System.in);
 int l,b,h,v,sa;
 System.out.println("Enter The Lenght");
 l=s.nextInt();
System.out.println("Enter The Breadth");
 b=s.nextInt();
System.out.println("Enter The height");
 h=s.nextInt();
 v=l*b*h;
 sa=2*(l*b+b*h+h*l);
 System.out.println("Volume:"+v);
 System.out.println("Surface Area:"+sa);
}
}