
import java.util.Scanner;
public class password_checking{

  public static void main(String[] args){

    Scanner sc =new Scanner(System.in);
    String correct_password = "juhi@123";
    String password;
    System.out.println("Enter the password: ");
    password =sc.nextLine();

    while(!password.equals(correct_password)){
      System.out.println("Wrong Password");
      System.out.println("Enter the password again: ");
      password = sc.nextLine();

  }
  sc.close();
  System.out.println("Correct password Login successfully");
  
}
}
