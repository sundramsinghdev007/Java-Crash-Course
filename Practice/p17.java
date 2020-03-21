/*equals():It avaialbe in String Class. It use to compare two Strings for equality.The equals function return boolean value.

equalsIgnoreCase():It avaialbe in String Class. It use to compare two Strings for equality.This function avoid case sensitivity.This () also returns boolean value.
*/

import java.util.*;
class p17
{
  public static void main(String [] args)
  {
   Scanner sc=new Scanner(System.in);
   String name,names;
   System.out.print("Enter 1st String:");
    name=sc.nextLine();
    System.out.print("Enter 2nd String:");
    names=sc.nextLine();
    if(name.equals(names)==true)  //name.equalsIgnoreCase(names);
       {
          System.out.println("Equal");
         }
      else
            {
              System.out.println("Not equal");
             }
   }
}