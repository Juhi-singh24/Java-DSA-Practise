
import java.util.*;
public class FirstNonRepeatingCharacter {

  public static void main(String[] arg){

    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter the string : ");
    String str = sc.nextLine();
    char chr;
    char answer;

    HashMap <Character, Integer> map = new HashMap<>();

    for(int i = 0; i < str.length(); i++){
       chr = str.charAt(i);
       map.put(chr,map.getOrDefault(chr, 0)+1);


    }

    for(int i = 0 ; i< str.length(); i++){
      chr = str.charAt(i);

      if(map.get(chr) == 1){
        answer = chr;
        System.out.println("The first non repeating character:" +answer);
        break;

    }

  

      

    }

    sc.close();

    
  }
  
}
