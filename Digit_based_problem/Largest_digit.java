//Taking the input from the user and find the largest digit in it

import java.util.Scanner;
public class Largest_digit {
  
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number: ");
    int num = sc.nextInt();
    int digit;
    int lrge_digit=0;

    while(num>0){
      digit = num % 10;

      if (digit > lrge_digit){
        lrge_digit = digit;
      }
      num = num / 10;
    }

    System.out.println("Largest digit : "+lrge_digit);
    sc.close();

  }
}
