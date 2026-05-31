
import java.util.Scanner;
public class menu {

  public static void main(String[] arg){
    Scanner sc = new Scanner(System.in);
    String option;
    System.out.println("WELCOME TO MENU!");
    System.out.println("Home");
    System.out.println("Billing");
    System.out.println("login");
    System.out.println("Exit");

    do{
      
      System.out.println("Enter the menu option: ");
      option = sc.nextLine();

    }while(!option.equals("Exit"));
    
    sc.close();
  }
  
}
