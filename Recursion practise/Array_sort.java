//In this program we are going to check whether an array is Sorted or not using Recursion🔥✨

public class Array_sort{

  public static Boolean sort(int arr[],int n){
    if(n == arr.length - 1){
      return true;
    }

    if(arr[n] > arr[n+1]){
      return false;
    }

    return sort(arr,n+1);
  }

  public static void main(String[] args){
    int[] arr ={2,9,7,8};
    int n = 0;

    Boolean sorted = sort(arr,0);

    System.out.println(sorted);

  }
}