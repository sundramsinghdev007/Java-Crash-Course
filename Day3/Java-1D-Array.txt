/*Java Arrays
Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
To declare an array, define the variable type with square brackets:*/

class ArrayDemo {
  public static void main(String[] args) {
    //one dimensional string array
    String[] superHeros = {"Iron-man", "Thor", "Hulk", "Voda"};
    System.out.println(superHeros[0]); //output Iron-man
    
    //Change an Array Element
    superHeros[0]="Captain America";
    System.out.println(superHeros[0]); //output Captain America
    
    //getting array length
    System.out.println(superHeros.length);
    
    //Loop Through an Array
    for (int i = 0; i < cars.length; i++) {
      System.out.println(superHeros[i]);
    }
  }
}
