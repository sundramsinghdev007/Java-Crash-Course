class A
{
 public void showA()
  {
   System.out.println("This message is from class A");
   }
}
 class B extends A
{
   public void showB()
   {
    System.out.println("This message from class B");
    }
}
  class C extends B
{
  public void showC()
  {
   System.out.println("This message from class C");
  }
}
  class InheritanceDemo3
{
  public static void main(String... args)
  {
   C c=new C();
    c.showA();
    c.showB();
    c.showC();
  }
}
