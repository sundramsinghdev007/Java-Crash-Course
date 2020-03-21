/*String:-String is a class available in java.lang package.
Scanner sc=new Scanner(System.in);
String sc=sc.nextLine();
First Function Of String Class
__________________________
toUpperCase():-toUpperCase() is available in String Class.This () converts the string into UpperCase.
toLowerCase():-toLowerCase() is available in String Class.This () converts the string into LowerCase.
length():It counts the characters of String.
*/

import java.util.*;
class p16
{
  public static void main(String... args)
    {
     String name;
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter your name:");
      name=sc.nextLine();
    String a=name.toUpperCase();
      System.out.println(a);
      System.out.println(name.toLowerCase());
      System.out.println(name.length());
     }
}
