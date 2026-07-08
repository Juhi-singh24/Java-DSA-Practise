// In this program we are going to check whether an array contains duplicate or not

import java.util.*;
public class check_duplicate{

  public static boolean duplicate(int[] arr){

    

    HashSet <Integer> set = new HashSet<>();

    for(int num:arr){

      if(set.contains(num)){

        System.out.print("Array contains the duplicate value: ");

        return true;
      }
        set.add(num);
      }
      System.out.print("Array doesn't contains the duplicate value");
      return false;
    }



  public static void main(String[] args){

    int[] arr = {2,3,5,7};
    System.out.print(duplicate(arr));
  }
}