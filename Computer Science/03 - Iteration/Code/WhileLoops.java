import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter number: ");
    
    int there = input.nextInt();
    input.close();

    int we = 0;

    while (we != there) {
      System.out.println("Are we there yet? No.");
      we++;
    }

    System.out.println("Are we there yet? Yes.");
  }
}