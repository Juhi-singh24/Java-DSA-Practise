//Here we are going to take 5 numbers and find the largest among all the numbers.


import java.util.Scanner;
public class Largest_number {

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int[] arr = new int[5];
    int largest = 0;

    for(int i =0;i < 5; i++){
      System.out.print("Enter the number please: ");
      arr[i] = sc.nextInt();
      
      if(arr[i] > largest){
        largest = arr[i];
      }

    }
    System.out.println("The largest number: "+ largest);
    sc.close();
  }
  
}
