/*
Develop a class named Rectangle with private data members length and width. Make a parameterized Constructor to initialize data members. Now make two methods rectarea() and rectperi() to calculate area and perimeter. Test the class Rectangle.
*/
import java.util.*;
class Rectangle
{
  private long length,area;
  private long width,peri;
   Rectangle(long l,long w)
   {
     length=l;
     width=w;
   }
     public long Area(long a,long b)
     {
       area=a*b;
      return area;
     }
      public long Perimeter(long a,long b)
     {
      peri=2*(a+b);
      return peri;
    }
    public void Display()
    {
       System.out.println("Area : "+area);
       System.out.print("Perimeter : "+peri);
     }
}
class Task
{
  public static void main(String... args)
   {
    long l1,w1;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the length of rectangle=");
    l1=sc.nextLong();
    System.out.print("Enter the width of rectangle=");
    w1=sc.nextLong();
    Rectangle d = new Rectangle(l1,w1); 
    System.out.println("Area Of Rectangle="+d.Area(l1,w1));
    
    System.out.println("Perimeter Of Rectangle="+d.Perimeter(l1,w1));
   }
}