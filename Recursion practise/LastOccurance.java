//In this progrm we are going to find the last occurance of an element in an Array using Recursion

import java.util.Scanner;
public class LastOccurance{

  public static int search(int arr[],int target,int index){

    if(index == arr.length){
     
      return -1;
     
    }

    int find = search(arr,target,index+1);

    if(find != -1){

      return find;

    }

    if(arr[index] == target){

      return index;

    }
    return -1;

  }


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] arr = {1,2,4,5,2,3};

    System.out.println("Enter the element you want to earch:");
    int searchelement = sc.nextInt();

    int result = search(arr,searchelement,0);

    if(result == -1){
      System.out.println("Element is not found");
    }

    else{
      System.out.println("Element last occurance is:"+result);
    }

    sc.close();
  }


}