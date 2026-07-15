// In this program I am finding the maximum sum using Kadane's Algorithm


public class kadane{

  public static int maxSubarraySum(int[] arr){

    int current_sum = 0;
    int maxsum = Integer.MIN_VALUE;

    for(int i =0;i<arr.length;i++){
      current_sum += arr[i];
      maxsum = Math.max(maxsum,current_sum);

      if(current_sum < 0){
        current_sum = 0;
      }

    }

    return maxsum;

  }

  public static void main(String[] args){

    int[] arr ={-2,1,-3,4,-1,2,1,-5,4};

    System.out.println(maxSubarraySum(arr));

  }
  
}
