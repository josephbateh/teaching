import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Radius:");
    double radius = input.nextDouble();
    
    double pi = 3.14159;
    System.out.println("Area: " + (2 * pi * radius));

    input.close();
  }
}