//In this Program we are going to find a First Occurance of an Element in an Array using Recursion


import java.util.Scanner;
public class FirstOccurance{


  public static int search(int arr[],int target,int index){

    if(index == arr.length-1){
      if(arr[index] != target){
        return -1;
      }
      else{
        return index;
      }
    }

    if(arr[index] == target){
      return index;
    }

    return search(arr,target,index+1);

    
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    
    System.out.println("Enter the element you want to search:");
    int element = sc.nextInt();
    
    int[] arr ={4,6,2,7};

    int result = search(arr,element,0);

    if(result == -1){
      System.out.println("Element not found");

    }

    else{
      System.out.println("Element found at index:"+result);
    }
    sc.close();

  }
  
}