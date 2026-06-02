// In this program we are going to count odd number present in the input number taken from hthe user.


import java.util.Scanner;
public class odd_number {

  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the size please: ");
    int size = sc.nextInt();
    int count=0;
    int[] arr = new int[size];

    for(int i = 0; i< arr.length ; i++){
      System.out.print("Enter the elements: ");
      arr[i] = sc.nextInt();

      if ((arr[i] % 2 ) != 0){
        count++;
      }
    }
    System.out.print("The total number of odd numbers: "+count);
  }
  
}
