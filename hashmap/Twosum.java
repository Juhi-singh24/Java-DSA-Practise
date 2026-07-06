//In this program I am going to solve the classic DSA proble "Two Sum"


import java.util.*;
public class Twosum {

  public static int[] twosum(int[] nums,int target){

     HashMap<Integer, Integer> map = new HashMap<>();

    for(int i = 0; i< nums.length; i++){

      int arr = nums[i];
      int  complement = target - arr;

     

      if(map.containsKey(complement)){

        return new int[] {map.get(complement),i};

      }

      else{
        map.put(arr,i);
      }

    }

    return new int[] {};
  }
  
    
  


  public static void main(String[] args){
    int[] nums = {2, 11, 15 , 7};
    int target = 9;
    
    int[] ans = twosum(nums, target);
    System.out.println(Arrays.toString(ans));
    

  }
  
}
