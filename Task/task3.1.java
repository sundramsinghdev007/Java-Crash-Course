import java.util.*;
class BankAccount
{
  String Dname;
  String Atype;
 private int Anumber;
  long Bamount;
    BankAccount(int Actno)
   {
      Anumber=Actno;
   }
  public void setDepositor(String depname,String depAtype,int balamount)
    {
      Dname=depname;
      Atype=depAtype;
      Bamount=balamount;    
    }
    public float Deposit(float amt)
     {
         Bamount+=amt;
        return Bamount;
      }
       public float Withdraw(float amt)
         {
           if(amt==0 || amt>Bamount)
             {
                System.out.println("Enter Valid Amount ? Thank You!!");
              }
          else
         {
          Bamount-=amt;
         }
 return Bamount;
}
   public void Display()
    {
      System.out.println("Department Name="+Dname);
      System.out.println("Account Type="+Atype);
      System.out.println("Account Nmuber"+Anumber);
      System.out.println("Balance Amount"+Bamount);
}
}
    class Task
    {
     public static void main(String... args)
    {
         long amt;
      Scanner sc = new Scanner(System.in);
      BankAccount s=new BankAccount(15454);
      s.setDepositor("Sundram Singh","Saving",650000);
      s.Display();
     System.out.print("Enter the amount for deposit=");
      amt=sc.nextInt();
     System.out.println("Updated Balance is="+s.Deposit(amt));
     System.out.print("Enter the amount for withdraw=");
     amt=sc.nextInt();
      System.out.println("Updated Balance is="+s.Withdraw(amt));   
    }
}