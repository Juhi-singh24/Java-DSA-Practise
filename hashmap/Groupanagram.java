// In this program we are going to  group Anagrams

import java.util.*;
public class Groupanagram{

  public static List<List<String>> group_anagram(String[] strs){

    HashMap <String,List<String>> map = new HashMap<>();

    for(String word:strs){
      char[] arr = word.toCharArray();
      Arrays.sort(arr);

      String sortedword = new String(arr);

      if(!map.containsKey(sortedword)){
        map.put(sortedword,new ArrayList<>());
      }

      map.get(sortedword).add(word);
    }

    return new ArrayList<>(map.values());
  }

  public static void main(String[] args){

    String[] strs = {"rat","cat","tar","eat","ate"};
    System.out.println(group_anagram(strs));
  }



}