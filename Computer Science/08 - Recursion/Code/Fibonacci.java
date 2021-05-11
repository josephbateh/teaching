import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Get argument from the user
    System.out.print("Enter number: ");
    int number = input.nextInt();
    System.out.println();
    input.close();

    System.out.println(fibonacci(number));
  }

  private static int fibonacci(int x) {
    if (x == 0 || x == 1) {
      return 1;
    }

    return fibonacci(x - 1) + fibonacci(x - 2);
  }
}
