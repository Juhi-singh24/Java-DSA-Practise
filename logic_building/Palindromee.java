import java.util.*;
public class Palindromee{
 
public static void main(String[] args){

  Scanner sc = new Scanner(System.in);

  System.out.print("Enter the number please:");
  int num = sc.nextInt();

  System.out.println("You entered:" +num);
  int original = num;
  int reverse = 0;

  while(num > 0){
    int remainder = num % 10;
    reverse = reverse * 10 + remainder;
    num = num / 10;
  }

  if(reverse == original){
    System.out.println("Yes it is a palindrome");
  }

  else{
    System.out.println("Not a palindrome");
  }

  sc.close();

}
}
