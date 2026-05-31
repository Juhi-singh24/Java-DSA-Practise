
import java.util.Scanner;
public class Mrks {

  public static void main (String[] arg){

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the marks of Physics: ");
    double physics = sc.nextDouble();
    System.out.println("Enter the marks of Chemistry: ");
    double chemistry = sc.nextDouble();
    System.out.println("Enter the marks of Math: ");
    double math = sc.nextDouble();
    System.out.println("Enter the marks of English: ");
    double english = sc.nextDouble();
    System.out.println("Enter the marks of Music: ");
    double music = sc.nextDouble();

    System.out.println("Percentage Overall: ");
    double percentage = ((physics + chemistry + math + english + music) / 5);
    System.out.println(percentage);

    sc.close();
  }
}

