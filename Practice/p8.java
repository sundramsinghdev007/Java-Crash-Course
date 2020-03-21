import java.util.*;
class Table
{
public static void main(String [] args)
{
int no,i,a,d;
 Scanner s=new Scanner(System.in);
 System.out.println("Enter The No");
 no=s.nextInt();
a=no;
i=1;
while(i<=10)
{
 d=a*i;
  System.out.print(no+"*"+i);
  System.out.println("="+d);
i++;
}
}
}