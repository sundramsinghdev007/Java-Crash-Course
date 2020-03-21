import java.util.*;
 class attitude 
{
    public static void main(String... args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name here: ");

        String str = sc.nextLine();

        char[] ch = str.toCharArray();
        int tinteger = 64;

        for (char c : ch) {
            int temp = (int) c;

               if (temp <= 90 & temp >= 65){
            int sum = (temp - tinteger);
          
            int sum1=0;
           sum1 = sum1+sum;
             System.out.println(sum);
          System.out.println("Sum"+sum);
        }   
      }
    }
}