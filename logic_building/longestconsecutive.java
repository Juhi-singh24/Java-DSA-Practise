import java.util.*;
public class longestconsecutive {

  public static void main(String[] args){
    int[]  arr = {10,5,12,6,7,8,20};
    int maxcount = 0;
     int count =1 ;


    Arrays.sort(arr);

    for(int i =0; i<arr.length -1; i++){
     
      
      if((arr[i]+1) == (arr[i+1])){

        count++;

        if(count > maxcount){

          maxcount = count;

        }   

    }

    else{
      count = 1;
    }
  
    }

    System.out.println("The longest consecutive sequence :" +maxcount);


  }
  

}
