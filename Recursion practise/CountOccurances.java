// In this program we are gooing to count the occurances of an target element usiing Recursion.

import java.util.Scanner;
public class CountOccurances{

  public static int countocc(int arr[] , int target , int index){

    
    if(index == arr.length){
      return 0;
    }
     
    return (arr[index] == target ? 1 : 0) + countocc(arr, target, index + 1);

  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the target element:");
    int target = sc.nextInt();

    int[] arr = {1,2,4,3,2,4,2,6};

    int result = countocc(arr, target, 0);

    System.out.println("The occurance of target element:" +result);

    sc.close();
    
  }
}