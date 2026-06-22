//In this program we are going to find all the indexes of Target value in an Array using Recursion

import java.util.*;
public class Occurances {

  public static void search(int arr[],int target,int index,ArrayList<Integer> list){

    if(index == arr.length){

      return;

    }

    if(arr[index]  == target){

      list.add(index);
    }

    search(arr,target,index+1,list);

    
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] arr = {1,3,2,5,63,2};
    ArrayList<Integer> list = new ArrayList<>();

    System.out.println("Enter the target element:");
    int input = sc.nextInt();

    search(arr,input,0,list);

    sc.close();

    System.out.println("Target values are at indexes:"+list);

  }
}
  

