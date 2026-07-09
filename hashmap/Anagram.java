//In this program we are going to check whether a String is Anagram or not.

// we can call two strings an Anagram when both the strings are of the same length and contain the same chracter as well as the frquency of character is alos same, order doesn't matter.

// For eg String s ='rat' String t = 'tar'

import java.util.*;
public class Anagram{

  public static boolean check_Anagram(String s,String t){

    if(s.length() != t.length()){
      return false;
    }

    HashMap<Character, Integer> map = new HashMap<>();

    for(int i=0;i<s.length();i++){
      char ch = s.charAt(i);
      map.put(ch,map.getOrDefault(ch,0)+1);
    }

    for(int j=0;j<t.length();j++){

      char ch = t.charAt(j);
      
      if(!map.containsKey(ch)){

        return false;

    }

     map.put(ch,map.get(ch)-1);

     if(map.get(ch) == 0){
      map.remove(ch);
     }
    }

     return map.isEmpty();

  }
  

  public static void main(String[] args){

    String s="rat";
    String t="tra";

    System.out.println(check_Anagram(s,t));

  }
}