class StringExample{
  public static void main(String[] args) {
      String greeting = "Hello";
      String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      String txt1 = "Hello World";
      String firstName = "John";
      String lastName = "Cena";
      System.out.println(greeting);
      //print the length of the string
      System.out.println("The length of the txt string is: " + txt.length());
      System.out.println(txt1.toUpperCase());   // Outputs "HELLO WORLD"
      System.out.println(txt1.toLowerCase());   // Outputs "hello world"
      //find the particular word or letter address
      System.out.println(txt1.indexOf("World"));
      //for caoncate the string
      System.out.println(firstName + " " + lastName);
      System.out.println(firstName.concat(lastName));
    }
}
