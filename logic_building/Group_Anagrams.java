// In this program we are going to group those words who have same character and frequency of character is also same.

import java.lang.reflect.Array;
import java.util.*;
public class Group_Anagrams{
  public static void main(String[] args){
    HashMap <String ,ArrayList<String>> map = new HashMap<>();
    String[] arr = {"eat","tea","tan","ate","nat","bat"};

    for(int i = 0; i<arr.length; i++){
      String word = arr[i];
      char[] chars = word.toCharArray();
      Arrays.sort(chars);
      String key = new String(chars);

      if(map.containsKey(key)){
        map.get(key).add(word);
      }

      else{
        ArrayList <String> list = new ArrayList<>();
        list.add(word);
        map.put(key,list);
      }
    }

    System.out.println(map);
  }
}