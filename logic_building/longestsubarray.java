import java.util.*;
public class longestsubarray {

  public static void main(String[] args){

    HashMap <Integer, Integer> map = new  HashMap<>();

    int[] arr = {1,2,1,2,3};
    int k = 2;
    int left = 0;
    int right = 0;
    int n = arr.length;
    int length =0;
    int max_length = 0;

    while(right < n){
  

        map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);
        
      

      while(map.size() > k){
        if(map.get(arr[left]) == 1){
          map.remove(arr[left]);
        }

        else{
          map.put(arr[left] ,map.get(arr[left])- 1);
        }

        left++;
      }

      length = right - left +1;

        if(max_length < length){
          max_length = length;
        }
        right++;

    }
 
    System.out.println("The longest contigous subarray : " + max_length);
  }


  
}
