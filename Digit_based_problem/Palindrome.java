//Here we are going to take a input number from a user and check whether it is palindrome or not.
// Palindrome number Example if number = 121 and reverse of a number is also = 121 ,Therefore it ias a Palindrome number.

import java.util.Scanner;
public class Palindrome{
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = sc.nextInt();
    int reverse = 0;
    int digit;
    int original = num;

    while(num > 0){
      digit = num % 10;
      reverse = reverse * 10 + digit;
      num = num / 10;

    }
    if (reverse == original){
      System.out.println("Yes it is a palindrome " +reverse);
    }
    else{
      System.out.println("Not a palindrome");
    }
    sc.close();
  }
}
  

