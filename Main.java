class Main {
  public static void main(String[] args) {
    // Variables must be meaningful can include letters, numbers, _,$, &
    // It cannot start with a number -- 1age not OK, but age1 is OK
    // Case counts so Total is different than total
    // if a word changes color on the screen it already is used in java
    // Variables must also be declared with a data type(What you are going to store
    // in it)
    // int - integers (whole numbers), double (decimal numbers), String(words)

    int num1 = 10; // Declared the variable and initialized it
    int num2 = 20;
    int sum;
    double radius = 5.5;
    double height = 10.2;
    double volume;
    final double PI = 3.14159;// Constants are declared final and in all caps

    sum = num1 + num2;

    System.out.println("===============================");
    System.out.println("The sum of both numbers is " + sum);
    System.out.println("===============================");

    volume = PI * radius * radius * height;

    System.out.println("The volume is: " + volume);

    radius = 10.2;
    height = 100.3;

    volume = PI * radius * radius * height;
    System.out.println("The volume is: " + volume);

  }
}