//In this program we are going to find the the frequency of each element in an array

import java.util.HashMap;

public class Findfrequency {

  public static void main(String[] args){

    int[] arr = {4, 2, 4, 1, 2, 4, 3};

    HashMap <Integer, Integer> map  = new HashMap<>();
    
    for(int i=0;i<arr.length;i++){
      int num = arr[i];

      if(map.containsKey(num)){
        map.put(num,map.get(num) + 1);
      }

      else{
        map.put(num,1);
      }

    }

    System.out.println(map);

  }
  
}
