// In this program I am storing student marks and their marks using hashmap


import java.util.*;

public class hashmappractise {


  public static void main(String[] args){
    HashMap<String, Integer> map = new HashMap<>();

    map.put("Juhi",91);
    map.put("Riya",84);
    map.put("Aman",71);
   
  
    System.out.println(map.get("Juhi"));
    System.out.println(map.containsKey("Riya"));
    map.put("Aman",10);

    System.out.println(map.get("Aman"));

  }
  
}
