//In thi program we are going to take 5 numbers as input and print them.

import java.util.Scanner;
public class print_elements {

  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the only 5  number please: ");
    int[] arr =new int[5];
    for(int i = 0;i < arr.length; i++){
      arr[i] = sc.nextInt();
      System.out.println(arr[i]);
    }

    sc.close();
  }

  
}
