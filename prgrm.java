import java.util.Scanner;

class prgrm {
  public static void main(String[] args) {
    Scanner ameen = new Scanner(System.in);

    System.out.println("Enter name, age and salary:");

    String name = ameen.nextLine();
    int age = ameen.nextInt();
    double salary = ameen.nextDouble();
    
       
      
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Salary: " + salary);
  }
}