// In this prograam we are going to coolect  all target values in the array using Recursion

import java.util.*;
public class CollectTarget{

  public static void search(int arr[],int target,int index,ArrayList<Integer> list){

    if(index == arr.length){

      return;

    }

    if(arr[index]  == target){

      list.add(target);
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

    System.out.println(list);

  }
}