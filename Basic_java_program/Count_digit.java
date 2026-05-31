
import java.util.Scanner;
public class Count_digit{

  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    int count = 0;
    System.out.println("Enter the number: ");
    int digit = sc.nextInt();

     while(digit > 0){
      digit= digit / 10;
      count++;


     }
     System.out.println("The number of digits: " + count);
     sc.close();
  }
}