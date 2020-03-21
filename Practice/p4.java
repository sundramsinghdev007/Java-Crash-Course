//Find greatest no between two no

import java.util.*;
class Greatest
{
 public static void main(String... args)
{
 Scanner s=new Scanner(System.in);
 double a,b;
 System.out.println("Enter The First No:");
 a=s.nextDouble();
 System.out.println("Enter The Second No:");
 b=s.nextDouble();
 if(a>b)
   {
    System.out.println("a is greater"+a);
    }  
  else
    {
      System.out.println("b is greater"+b);
     }   
}
}
