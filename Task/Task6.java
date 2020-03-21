/*Write a Java program to accept a coordinate point in a XY
coordinate system and determine its quadrant.
*/
import java.util.*;
class Quardent
{
   public static void main(String... args)
   {
    Scanner s=new Scanner(System.in);   
    long X,Y;
    System.out.print("Enter the value of Abscissa (X)=");
    X=s.nextLong();
    System.out.print("Enter the value of Ordinate (Y)=");
    Y=s.nextLong();
    if(X>0 && Y>0)
       {
         System.out.print("Cordinate belong in First Cordinate"+"("+X+","+Y+")");
       }
        else if(X<0 && Y>0)
            {
	System.out.print("Cordinate belong in 4th Cordinate"+"("+X+","+Y+")");
	}
                else if(X>0 && Y<0)
                   {
	System.out.print("Cordinate belong in 2nd Cordinate"+"("+X+","+Y+")");
	     } 
                       else if(X<0 && Y<0)
                              {
                	System.out.print("Cordinate belong in 3rd Cordinate");
	         }
	             else 
                              {
                	System.out.print("Cordinate present at origin"+"("+X+","+Y+")");
	         }
    }
}
