import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter number: ");
    
    int there = input.nextInt();
    input.close();

    for (int i = 0; i < there; i++) {
      System.out.println("Are we there yet? No.");
    }

    System.out.println("Are we there yet? Yes.");
  }
}