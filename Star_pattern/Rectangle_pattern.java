import java.util.Scanner;
public class Rectangle_pattern {

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number please: ");
    int num = sc.nextInt();

    for(int i = 1;i <= num ; i++){
      for(int j = 1; j<=num ; j++){
        System.out.print("*");

      }
    System.out.println();
    }
    sc.close();
  }
  
}
