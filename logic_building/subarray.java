//In this program we are going to find a longest contigous subarray whose sum is greater than or equal to target.

public class subarray{
  public static void main(String[] args){
    int[] arr = {2,1,5,1,3,2,1};
    int k =7;
    int n = arr.length;
    int left=0;
    int right=0;
    int curr_length=0;
    int max_length=0;
    int sum=0;

    while(right < n){

      sum = sum + arr[right];

      while(sum > k){
        sum = sum - arr[left];
        left++;

      }

      curr_length = right -left +1;
      if(max_length < curr_length){

        max_length = curr_length;

      }
      right++;

    }
    System.out.println("Longest Subarray :" + max_length);
  }
}