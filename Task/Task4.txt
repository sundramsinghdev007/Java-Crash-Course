//Develop a program in java to find sum of digits of given number.
import java.util.Scanner;
class task
{
    public static void main(String... args)
    {
        int n, s, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        n = sc.nextInt();
        while(n > 0)
        {
            s = n % 10;
            sum = sum + s;
            s = s / 10;
        }
        System.out.println("Addition of Digits:"+sum);
    }
}
