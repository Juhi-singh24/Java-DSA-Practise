// In this program we are going to find the largest digit of a number given by the user.

import java.util.Scanner; //import the scanner class
public class Largestdigit{


  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number please:");

    int num = sc.nextInt();
    int largest= num % 10; // initial value of largest

    while(num > 0){

      int rem = num % 10 ; // Extrating the remainder
      
      if (rem > largest ) // compare the rem and largest value
      {
        largest = rem ;
      }
      num = num / 10; // remove the last digit
    }

    
		System.out.println("largest digit:"+largest);

    sc.close();

  }
}
