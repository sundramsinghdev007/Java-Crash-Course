/*
String():The split() function is available in String Class. It use to split the string into substrings from given character.This function return the array of string.

String name="Sundram Singh";
String []shortname=name.split('');

charAt():-The charAt() function is used to access the character of given String of specified position.

*/
//Wap aprogram to take user name as i/p and display the short name.
import java.util.*;
class string
{
  static public void main(String... args)
  {
   String name;
    int i;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter your full name: ");
    name=sc.nextLine();
    String [] shortname=name.split(" ");
    System.out.print("Your Short Name: ");
     for(i=0;i<shortname.length-1;i++)
   {
    System.out.print(shortname[i].charAt(0)+"."); 
   }
   System.out.print(shortname[shortname.length-1]);
   }
}

















