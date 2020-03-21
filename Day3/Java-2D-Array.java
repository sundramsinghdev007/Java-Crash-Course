class MyClass {
  public static void main(String[] args) {
    int[][] num = { {1, 2, 3, 4}, {5, 6, 7} };
    int x = num[1][2];
    System.out.println(x);  
    //Loop Through an 2D Array
    for (int i = 0; i < num.length; ++i) {
      for(int j = 0; j < num[i].length; ++j) {
        System.out.println(myNumbers[i][j]);
      }
    }
  }
}
