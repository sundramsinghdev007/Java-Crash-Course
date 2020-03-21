//Wap a program to find sum and average of ten numbers using array

import java.util.*;
class sum
{
  public static void main(String [] args)
  {
    int i,sum=0;
   double avg=0;
    int [] bat=new int[10];
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the ten numbers:");
     for(i=0;i<10;i++)
      {
        bat[i]=sc.nextInt();
        sum=sum+bat[i];
         avg=(float)sum/10; //Type casting
       }
      System.out.println("Sum="+sum);
      System.out.println("Average="+avg);
   }
}