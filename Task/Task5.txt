/*
Develop a program in java which take user full name as input and display the short name. For example Ajay Singh will be A.Singh.
*/

import java.util.*;
class shortName
{
 public static void main(String... args)
  {
   String name;
   int i;
    Scanner s=new Scanner(System.in);
    System.out.print("Enter your name:");
    name=s.nextLine();
    String [] shortname=name.split(" ");
    System.out.print("Enter your short name is:"); 
    for(i=0;i<shortname.length-1;i++)
    {
      System.out.print(shortname[i].charAt(0)+".");
    }   
      System.out.print(shortname[shortname.length-1]);
   }   
}
