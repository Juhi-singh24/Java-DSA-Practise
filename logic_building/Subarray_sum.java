import java.util.HashMap;

public class Subarray_sum{

  public static void main(String[] args){

    int[] arr = {2,-1,2,3,-2};
    int n = arr.length;
    int target = 2;
    int[] prefix = new int[n+1];
    int count=0;

    HashMap <Integer, Integer> map = new HashMap<>();
    prefix[0] =0;
    map.put(0,1);
    for(int i=1; i< prefix.length; i++){
      prefix[i] = prefix[i-1] + arr[i-1];
      
      int previous_prefixsum = prefix[i] - target;

      if(map.containsKey(previous_prefixsum)){

        count +=map.get(previous_prefixsum);

      }

      map.put(prefix[i],map.getOrDefault(prefix[i],0)+1);

    }

  System.out.println("The number of subarrays whose sum equal to target :" +count);


  }
  
}