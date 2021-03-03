class Main {
  public static void main(String[] args) {
    double radius = 5;
    System.out.println("Radius: " + radius);
    
    double diameter = radius;
    diameter *= 2;
    System.out.println("Diameter: " + diameter);
    
    double pi = 3.14159;
    double area = pi * diameter;
    System.out.println("Area: " + area);
  }
}