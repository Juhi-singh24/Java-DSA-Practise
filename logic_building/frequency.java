// Count frequency of each digit


import java.util.*;
public class frequency {

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number please :"); 
    int num = sc.nextInt();
    int digit;

    HashMap <Integer, Integer> map = new HashMap<>();

    if(num == 0){
      map.put(num,1);
    }

    while(num > 0){
      digit = num % 10;

      map.put(digit,  map.getOrDefault(digit, 0)+1);

      num = num / 10;
    
    }
    
    System.out.println(map);
    sc.close();

  }
  
}
