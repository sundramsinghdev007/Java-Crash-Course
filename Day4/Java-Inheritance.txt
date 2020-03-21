/*Inheritance: it is the feature of object oriented programming and in inheritance we can create a new class by using exiting class.The exixting class is called base class, super class or parent class and new created class is called sub class or derived class or child class.
The concept of inheritance is also known as reuseability.
E.g*/
/*
Types of Inheritance supported in java:-

1:Single Level Inheritance:-In single inheritance there is only one base class and parent class.


2:Hierarchical Inheritance:There is a single base class and multiple base class.

3:Multi-level-inheritacne:

(hybrid,multiple)
Note;-The private acces modifier dose not participent in inheritance.
*/

class A
{

}
class extends A  //extends is a keyword
{

}
*/

class RunDog
{
  public void bark()
   {
  System.out.println("Moti.............");
  System.out.println("Bho......Bho........");
   }
}

class BullDog extends RunDog
{
  public void grawl()
   {
    System.out.println("Tuffy......................");
    System.out.println("Grawl.......");
    }
}
 class TestDog
 {
   public static void main(String... args)
   {
    BullDog dog=new BullDog();
    dog.bark();
    dog.grawl();
   }
}
