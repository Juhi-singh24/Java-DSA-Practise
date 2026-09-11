//In this program we are going to reverse the number given by the user.

import java.util.*;
public class Reverse{

  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number please:");

    int num = sc.nextInt();
    int reverse = 0;

    while(num > 0){
      int digit = num % 10;
      reverse = reverse * 10 + digit;
      num = num / 10;

    }

    System.out.println("Reverse of digit = " +reverse);
    sc.close();
  }
  
}