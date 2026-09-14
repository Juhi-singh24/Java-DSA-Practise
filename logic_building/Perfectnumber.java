// In this program we are going to check whether a number is perfect number or not.

import java.util.*;
public class Perfectnumber{

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number : ");
    int num = sc.nextInt();
    int original = num;
    int sum =0;

    for(int i=1; i<num ; i++){
      if(num % i == 0){
        sum = sum + i;

      }

    }

    System.out.println("Sum of perfect divisor = " + sum);

      if(sum == original){
        System.out.println(original + " is a perfect number");
      }

      else{
        System.out.println(original + " is not a perfect number");
      }
    
    sc.close();
  }

}