// Two sum 
import java.util.*;
public class twosum {

  public static void main(String[] arg){

    HashMap <Integer ,Integer> map = new HashMap<>();
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter the size of array :");
    int size = sc.nextInt();
    int[] arr = new int[size];
    int previous_Index;
    int current_index;


    System.out.print("Please enter the elements :");
    for(int i=0; i<size; i++){
      arr[i] = sc.nextInt();
    }

    System.out.print("Please enter the target :");
    int target = sc.nextInt();

    for(int i=0; i<arr.length;i++){
      int element = arr[i];
      int diff = target - element;

      if(map.containsKey(diff)){
        previous_Index = map.get(diff);
        current_index = i;

       System.out.println("Indices = [" + previous_Index + ", " + current_index + "]");
        break;

        
      }


      else{
        map.put(element,i);
      }
   

    }

  
    
    sc.close();


  }
  
}
