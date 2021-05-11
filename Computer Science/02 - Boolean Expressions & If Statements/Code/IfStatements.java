import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Get argument from the user
    System.out.print("Enter your age: ");
    int age = input.nextInt();
    System.out.println();
    input.close();
    
    // Check if person is old enough to drive
    boolean oldEnough = age >= 16;
    if (oldEnough) {
      System.out.println("You are old enough to drive.");
    } else {
      System.out.println("You are not old enough to drive.");
    }

    // Check if person is old enough to drive or have a permit
    if (age >= 16) {
      System.out.println("You are old enough to drive.");
    } else if (age == 15) {
      System.out.println("You are old enough to drive with a learners permit.");
    } else {
      System.out.println("You are not old enough to drive.");
    }
  }
}