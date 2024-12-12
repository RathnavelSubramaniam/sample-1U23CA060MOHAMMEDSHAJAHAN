import java.util.Scanner;

class prgrm {
  public static void main(String[] args) {
    Scanner sss = new Scanner(System.in);

    System.out.println("Enter name, age and salary:");

    String name = sss.nextLine();
    int age = sss.nextInt();
    double salary = sss.nextDouble();
    
       
      
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Salary: " + salary);
  }
}