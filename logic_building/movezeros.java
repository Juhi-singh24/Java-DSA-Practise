//in this program we are moving zeroes at the end while keeping the non-zeros in the same order.


import java.util.Arrays;

public class movezeros {

  public static void main(String[] args){

    int[] arr = {0,5,0,3,8,0,2};
    int j=0;
    int temp;
    

    for(int i=0; i< arr.length; i++){
      if(arr[i] != 0){
        temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
        j++;
      }

      

     
    }

     System.out.println("Array after moving zeros at the end =" +Arrays.toString(arr));



  }
  
}
