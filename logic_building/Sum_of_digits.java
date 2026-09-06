// This is Day 2 of building logic seriously . Today we are going to add the digit of a given number one by one.

import java.util.Scanner; //Importing a Scanner class
public class Sum_of_digits{

  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);  // Creating AN object of a Scanner class

    System.out.print("Enter the number please:");
    int num = sc.nextInt();
    int sum = 0;

    while(num > 0){
      int digit = num % 10; // Extracting the last digit
      sum = sum + digit; // Storing the sum
      num = num / 10; //Updating the number by removing the last digit
    }

    System.out.println("Sum of digits:" +sum);

    sc.close();

  }

}