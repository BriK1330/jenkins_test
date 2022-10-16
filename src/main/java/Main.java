import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Calculator calc = new Calculator();
    boolean on = true;
    System.out.print("Welcome to the Calculator!\n");


    Scanner sc=new Scanner(System.in);  //System.in is a standard input stream
    while(on) {
      System.out.print("Enter a Command: \n");

      String str=sc.next();
      //add
      switch (str) {
        case "add":
          System.out.println(calc.add(sc.nextInt(), sc.nextInt()));
          break;
        //subtract
        case "subtract":
          System.out.println(calc.subtract(sc.nextInt(), sc.nextInt()));
          break;
        //multiply
        case "multiply":
          System.out.println(calc.multiply(sc.nextInt(), sc.nextInt()));
          break;
        //divide
        case "divide":
          System.out.println(calc.divide(sc.nextInt(), sc.nextInt()));
          break;
        //fib
        case "fibonacci":
          System.out.println(calc.fibonacciNumberFinder(sc.nextInt()));
          break;
        //binary
        case "binary":
          System.out.println(calc.intToBinaryNumber(sc.nextInt()));
          break;
        //quit
        case "quit":
          on=false;
          break;
        default:
          System.out.println("Commands are add, subtract, multiply, divide, fibonacci, binary, and quit");
          break;
      }
    }
  }
}
