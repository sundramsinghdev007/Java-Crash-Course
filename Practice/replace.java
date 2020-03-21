/*Replace():It is available in string.This function is used to replace one string with another string in given string.
*/
import java.util.*;
class replace
{
 static public void main(String... args)
 {
  String sentence,fw,rw;
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter a sentence:");
   sentence=sc.nextLine();
   System.out.println("Find What ?");
    fw=sc.nextLine();
    System.out.println("Replace With");
    rw=sc.nextLine();
    System.out.println("Modified Sentence:"+sentence.replace(fw,rw));
 }
}