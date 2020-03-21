/*Parameters and Arguments
Information can be passed to methods as parameter. Parameters act as variables inside the method.
Parameters are specified after the method name, inside the parentheses. You can add as many parameters as you want, just separate them with a comma.*/

//Example
//here first_name is paramter
public class DemoClass {
  static void demoMethod(String first_name) {
    System.out.println(first_name);
  }

  public static void main(String[] args) {
    demoMethod("Thor");
    demoMethod("Ragnarok");
    demoMethod("Hail");
  }
}
//Multiple Parameters

//Example
public class DemoClass {
  static void demoMethod(String first_name, String last_name) {
    System.out.println(first_name,last_name);
  }

  public static void main(String[] args) {
    demoMethod("Thor","Malik");
    demoMethod("Ragnarok","Khan");
    demoMethod("Hail","Dubey");
  }
}
