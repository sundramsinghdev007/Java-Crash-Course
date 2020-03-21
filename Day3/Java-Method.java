/*A method is a block of code which only runs when it is called.

You can pass data, known as parameters, into a method.

Methods are used to perform certain actions, and they are also known as functions.

Why use methods? To reuse code: define the code once, and use it many times.*/

//Create a Method

/*A method must be declared within a class. It is defined with the name of the method, followed by parentheses (). Java provides some pre-defined methods, such as System.out.println(), but you can also create your own methods to perform certain actions:*/

//Example

//Create a method inside DemoClass:

public class DemoClass {
  static void demoMethod() {
    // code to be executed
  }
}
//Example Explained
/*
demoMethod() is the name of the method
static means that the method belongs to the MyClass class and not an object of the MyClass class and you have no need create object of the class to call this method.
void means that this method does not have a return value
*/
//Call a Method

//To call a method in Java, write the method's name followed by two parentheses () and a semicolon;

//Example
public class DemoClass {
  static void demoMethod() {
    System.out.println("I just run!");
  }

  public static void main(String[] args) {
    myMethod(); //method calling
  }
}
