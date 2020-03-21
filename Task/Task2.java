//TASK1.2
/*Develop a program in java which take a number as input and print the table of that number in following manner:2*1=2
2*2=4 and so on.*/

import java.util.Scanner;
class task1
{
static public void main(String... args)
    {
     Scanner s=new Scanner(System.in);
     int no,i,table;
     System.out.print("Enter the number=");
     no=s.nextInt();
     for(i=1;i<=10;i++)
      {
        table=no*i;
       System.out.println(no+"*"+i+"="+table);
      }
     }
}
