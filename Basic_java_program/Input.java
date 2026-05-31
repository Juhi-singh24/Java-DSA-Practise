
import java.util.Scanner;
public class Input {

public static void main (String[] args){
  Scanner sc = new Scanner(System.in);

  System.out.println("Enter your Name: ");
  String Name = sc.nextLine();

  System.out.println("Enter your age: ");
  int age = sc.nextInt();

  System.out.println("Enter your CGPA: ");
  double cgpa = sc.nextDouble();

  System.out.println(Name);
  System.out.println(age);
  System.out.println(cgpa);

  sc.close();
   
}
}
