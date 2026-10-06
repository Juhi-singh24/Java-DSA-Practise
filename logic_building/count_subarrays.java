import java.util.HashMap;

public class count_subarrays {

  static int atMost(int[] nums, int k){

    int left =0;
    int right =0;
    int count =0;
    HashMap<Integer, Integer> map = new HashMap<>();

      while(right < nums.length){
       
      map.put(nums[right],map.getOrDefault(nums[right],0)+1);
     
      

      while(map.size() > k){
        map.put(nums[left],map.get(nums[left])-1);

        if(map.get(nums[left]) == 0){
          map.remove(nums[left]);
        }

        left++;
      }

      count += right - left + 1;
      right++;

    }

     return count ;
  }


  public static void main(String[] args){

    int[] nums = {1,2,1,2,3};
    int k =2;

    int result = atMost(nums,k) - atMost(nums,k-1);
    System.out.println(result);

    


  }
  
}
