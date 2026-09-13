
import java.util.*;
public class Armstrong {

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Please Enter the number:");
    int num = sc.nextInt();
    int original = num;
    int temp = num;
    int total = 0;
    int count = 0;
    

    while(num > 0){
      num = num / 10;
      count++;
    }

    System.out.println("Number of digit = " +count);

    while(temp > 0){
      int power = 1;
      int digit = temp % 10;
      
      for(int i =0; i<count ;i++){
        power = power * digit;
      }

      total = total  + power;
      temp = temp /10;
    }

    System.out.println("Value after adding power of  each digit = " +total);
    System.out.println("Original number = "+original);


  if(total == original){
      System.out.println(original+ " is an Armstrong number");
    }

    else{
      System.out.println(original+ " is not an Armstrong number");
    }
    sc.close();
  
}
}