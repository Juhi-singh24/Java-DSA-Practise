//In this program we are going to find a subarray whose sum is equal to target usingSliding Window approach.

public class slidingwindow{

public static  void main(String[] args){

  int[] arr = {1,4,20,3,10,5};
  int target = 42;
  int n = arr.length;
  int left=0;
  int right=-1;
  int sum =0;
  int best_sta;
  int best_en;

  while(right < n){
    

    if (sum < target){

      right++;
      if(right == n){
        System.out.println("We haven't found the subarray");
        break;
      }
      sum = sum + arr[right];
    }


    else if(sum == target){

      best_sta = left;
      best_en = right;

     System.out.print("We have found the subarray whose sum is equal to target :" + " ");
      for(int i=best_sta ; i<= best_en ; i++)
      {
        System.out.print(arr[i] + " ");
      }

      break;
    }

    

    else{
      
      sum = sum -arr[left];
      left++;
    }

  }

}
}