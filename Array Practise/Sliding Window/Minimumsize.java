// In this program we are going  to find the minimum length of a contiguous subarray whose sum is greater than or equal to target using Variable Sliding window.


public class Minimumsize{


  public static int minsubarr(int[] arr,int target){

    int left = 0;
    int right;
    int minsize = Integer.MAX_VALUE;
    int sum = 0;


    for(right = 0; right < arr.length;right++){

      sum = sum + arr[right];
    
    while (sum >= target){

      minsize = Math.min(minsize,right - left +1);
      sum = sum - arr[left];
      left++;

    }

  }

    return minsize == Integer.MAX_VALUE ? 0 : minsize;
  }

  public static void main(String args[]){
    int[] arr = {2,3,1,2,4,3};
    int  target = 7;

    System.out.println(minsubarr(arr,target));
  }
}
