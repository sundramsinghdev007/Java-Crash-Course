/* Wap to store 4 name of your friends into the array and display them in ascending order*/
import java.util.*;
class asc
{
  static public void main(String... args)
  {
    Scanner sc= new Scanner(System.in);
    String [] names=new String[5];
    int i;
    System.out.println("Enter 5 names of your friends");
    for(i=0;i<5;i++)
    {
      names[i]=sc.nextLine(); 
     }
       Arrays.sort(names); //Sort array elements in asc order;
      
      for( String a:names)
      {
        System.out.println("names:"+a);
  }
}
}
/*dsc collections.reverse(array_name) it applicable for array list it is the class in collection framework*/