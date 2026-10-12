import java.util.HashMap;

public class Prefix_Exact_Sum {

  public static void main(String[] args){
    int[] arr = {3,-2,4,-1,2,-3,5};
    int k = 4;
    int n= arr.length;
    int[] prefix = new int[n+1];
    HashMap<Integer, Integer> map= new HashMap<>();
    int previous;
    int count =0;


    prefix[0] = 0;
    map.put(0,1);
    for(int i=1; i<prefix.length; i++){

      prefix[i] = prefix[i - 1] + arr[i-1];
      previous = prefix[i] - k;

      if(map.containsKey(previous)){
        count = count + map.get(previous);
      }


      map.put(prefix[i],map.getOrDefault(prefix[i], 0)+1);
  
    }

    System.out.println("There are " + count + " subarrays whose sum is exactly 1");
  }
  
}
