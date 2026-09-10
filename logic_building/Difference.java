// In this java Program we are going to find the difference etween a largest and smallest number.

import java.util.*;
public class Difference{

  public static void main(String args[]){

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number please:");
    int num = sc.nextInt();

    int largest = num % 10;
    int smallest =  num % 10;

    while(num > 0){
      int digit = num % 10;
      
      if(digit > largest){
        largest = digit;
      }

      if(digit < smallest){
        smallest = digit;
      }

      num = num / 10;


    }

    int difference = largest - smallest;
    System.out.println("Largets digit = "+largest);
    System.out.println("Smallest digit = "+smallest);
    System.out.println("Difference between largest and smallest = " +difference);

    sc.close();
  }

}