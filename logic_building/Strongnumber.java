//In this program wea re going to write a code for Strong number
// Strong number :- are those positive integer whose sum of the factorial of each digit equal to the number itself.

import java.util.*;

public class Strongnumber {


  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number please : ");
    int num = sc.nextInt();
    int original = num;
    int sum =0;

    while(num > 0){
      int factorial = 1;
      int digit = num % 10;

      for(int i =1 ; i <= digit ; i++){
        factorial = factorial * i;
      }

      sum = sum + factorial;

      num = num / 10;
    }

    System.out.println("Sum of factorial of each digit = " +sum);

    if ( original == sum ){
      System.out.println(original + " is a Strong number");
    }

    else{
      System.out.println(original + " is not a Strong nummber");
    }

    sc.close();

  }
  
}
