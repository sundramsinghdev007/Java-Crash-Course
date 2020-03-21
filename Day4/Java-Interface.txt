/*Interface:-The interface is the container of abstract methods and public static final variable.The interface is use to achieve full abstraction.Interface is declared by using interface "Keyword" followed by interface name. 
Note:-We give the method body in class which implements the interface.

Note:-If you have requirements but you don't know about implementation.Then you can use interface because interface contain 100% of unimplemetated methods.

Note:-If you have requirements you know implementation but complete implemetation then you can use abstract class because abstract class contain 0 to 100% of implemented or unimplemented methods.(declare and define)

Note:-If you have requirements and you know complete information then you can use class because class contain  100% of implemented methods.

class can extends class/abstract class.
class can implements interface.

abstract class can extends abstract class.
abstract class can implement interface.

interface can extend another interface.

E.g
*/
interface myinterface
{
  void m1();
  void m2();
  void m3();
}
   class TestMyInterface implements myinterface
{
 public void m1()
  {
   System.out.println("This message from m1");
   }
   public void m2()
   {
    System.out.println("This message from m2");
   }
   public void m3()
  {
  System.out.println("this message from m3");
   }
}
class test
{
 public static void main(String... args)
{
 TestMyInterface a=new TestMyInterface();
 
 a.m1();
 
  a.m2();
 
  a.m3();
}
}
/*multiple interface is supported in java
*we are able to create the reference variable of Interface but not able to create an object(Method)*/
