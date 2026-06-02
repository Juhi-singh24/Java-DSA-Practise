// In this program we are taking the input numbers  from the user and find the average of all elements of Array.


import java.util.Scanner;
public class Average_elements {

  public static void main(String[] args){

    Scanner sc =new Scanner(System.in);
    System.out.print("Enter the size please: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    int sum =0;

    for(int i =0; i < arr.length; i++){

      System.out.print("Enter the element please: ");
      arr[i] = sc.nextInt();
      sum= sum + arr[i];
    }

    double average = (double)sum / n;
    System.out.print("Average: "+ average);
  }
  
}
