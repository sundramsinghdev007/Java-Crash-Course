import java.util.*;
class table
{
public static void main(String [] args)
{
int no,i,a,d;
 Scanner s=new Scanner(System.in);
 System.out.println("Enter The No");
 no=s.nextInt();
a=no;
 for(i=1;i<=10;i++)
 {
   d=a*i;
   System.out.print(no+"*"+i);
  System.out.println("="+d);
}
}
}
