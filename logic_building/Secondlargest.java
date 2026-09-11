// In this program e are going to find out the second largest number

import java.util.*;
public class Secondlargest{

  public static void main(String[] args){

    Scanner sc= new Scanner(System.in);
    System.out.print("Please enter the input number: ");
    int num = sc.nextInt();

    int largest = num % 10;
    int second_largest = -1;

    while(num > 0){
      int digit = num % 10;

      if(digit > largest){
        second_largest = largest;
        largest = digit;
      }

      else if(digit < largest && digit > second_largest){
        second_largest = digit;
      }

      num =  num / 10;
    }

    System.out.println("Largest number = "+largest);
    System.out.println("Second largest = "+second_largest);

    sc.close();

  }
}