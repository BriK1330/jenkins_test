import java.util.Scanner;

public class Main {

  public static void main() {
    Calculator calc = new Calculator();
    boolean on = true;
    System.out.print("Welcome to the Calculator!");


    Scanner sc=new Scanner(System.in);  //System.in is a standard input stream
    while(on) {
      System.out.print("Enter a Command: ");

      String str=sc.next();
      //add
      switch (str) {
        case "add":
          calc.add(sc.nextInt(), sc.nextInt());
          break;
        //subtract
        case "subtract":
          calc.subtract(sc.nextInt(), sc.nextInt());
          break;
        //multiply
        case "multiply":
          calc.multiply(sc.nextInt(), sc.nextInt());
          break;
        //divide
        case "divide":
          calc.divide(sc.nextInt(), sc.nextInt());
          break;
        //fib
        case "fibonacci":
          calc.fibonacciNumberFinder(sc.nextInt());
          break;
        //binary
        case "binary":
          calc.intToBinaryNumber(sc.nextInt());
          break;
        //quit
        case "quit":
          on=false;
          break;
        default:
          System.out.print("Commands are add, subtract, multiply, divide, fibonacci, binary, and quit");
          break;
      }
    }
  }
}
