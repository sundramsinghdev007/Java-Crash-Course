//Wap a pprtogram to print the table of given number using array.

import java.util.*;
class array
{
  public static void main(String [] args)
  {
    int n,i;
    int [] tab = new int[10];
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number to print table:"); 
    n=sc.nextInt();
    int index=0;
    for(i=1;i<=10;i++)
    {
       tab[index]=n*i;
        index++; 
     }
       for(int r:tab)
        {
           System.out.println(n+"*"+i+"="+r);
         }
   }

}