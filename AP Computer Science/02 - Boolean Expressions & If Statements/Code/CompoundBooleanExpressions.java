import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Get argument from the user
    System.out.print("Enter your age: ");
    int age = input.nextInt();
    System.out.println();
    input.close();
    
    // Check if person is within the age range for legos
    if (age >= 4 && age <= 99) {
      System.out.println("You are the correct age to play with Legos.");
    } else {
      System.out.println("You are not the correct age to play with Legos.");
    }

    // Check if person is not born yet
    boolean born = age >= 0;
    if (!born) {
      System.out.println("You are not born yet!");
    }
  }
}