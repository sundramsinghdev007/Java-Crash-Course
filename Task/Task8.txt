/*Write a Java program to convert given number of days to a measure of time given in years, weeks and days. For example 375 days is equal to 1 year 1 week and 3 days (ignore leap year).	*/
import java.util.Scanner;
class test
{
    public static void main(String args[])
    {
        int m, year, week, day;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of days:");
        m = s.nextInt();
        year = m / 365;
        m = m % 365;
       System.out.println(m);
        week = m / 7;
        m = m % 7;
        System.out.println(m);
        day = m;
          
        System.out.println("Time="+year+"year"+week+"week"+day+"day");
    }
}
