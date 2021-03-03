import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter Number Of People:");
    int people = input.nextInt();

    System.out.println("Enter Number Of Tables:");
    int tables = input.nextInt();
    
    int peoplePerTableInt = people / tables;
    System.out.println("People Per Table: " + peoplePerTableInt);

    double peoplePerTableDouble = (double) people / (double) tables;
    System.out.println("People Per Table: " + peoplePerTableDouble);

    input.close();
  }
}