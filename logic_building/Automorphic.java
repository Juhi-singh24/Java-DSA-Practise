// program of Automorphic number (whose square ends in the same digit as number itself)


import java.util.*;
public class Automorphic {

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter the number: ");
    int num = sc.nextInt();

    int original = num;
    int count  = 0;
    int mod = 1;
    int sq_last;
    int digit;


    int square = num * num ;
    System.out.println("Square of number = " +square);
     while(num > 0){
      digit = num % 10;
      count++;
      num = num /10;
     }

     for (int i = 0; i< count ; i++){

      mod = mod * 10;
    }

     sq_last = square % mod;

     System.out.println("Last digits of square of number = " +sq_last);

     if(original == sq_last){
      System.out.print(original+ " is an Automorphic number");
     }

     else{
      System.out.println(original+ " is not an Automorphic number");
     }

     sc.close();

  }
  
}
