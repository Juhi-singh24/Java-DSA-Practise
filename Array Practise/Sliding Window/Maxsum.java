// In this program we are going to find the maximum sum of subarray with the help of Sliding window.

public class Maxsum{

  public static int maxsum(int[] arr,int k){

    int windowsum = 0;

    for(int i=0 ; i< k ; i++){
      windowsum += arr[i];
       
    }

    int max = windowsum;

    for(int i=k;i<arr.length;i++){
      windowsum = windowsum - arr[i-k] + arr[i];

      if(windowsum > max){
        max = windowsum;
      }
    }

    return max;
  }

  public static void main(String[] args){

    int[] arr = {2,1,5,1,7,2};
    int k = 3; /*Size of sliding window*/

    System.out.println(maxsum(arr,k));
  }
  
}