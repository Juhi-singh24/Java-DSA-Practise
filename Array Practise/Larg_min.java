// In this program we are going to find the Largest and Smallest element present in the input elements taken from the user.

import java.util.Scanner;
public class Larg_min {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size please: ");
    int size = sc.nextInt();
    int[] arr = new int[size];
    int  max = 0;

    for(int i = 0; i< arr.length ; i++){

      System.out.print("enter the element please: ");
      arr[i] = sc.nextInt();

      if ( arr[i] > max){
        max = arr[i];
      }
    }
      int min = arr[0];
      for(int i = 0; i< arr.length; i++){
      if(arr[i] < min){
        min = arr[i];
      }
    }

    System.out.println("The largest element: "+max);
    System.out.println("The minimum element: "+ min);


  }
  
}
