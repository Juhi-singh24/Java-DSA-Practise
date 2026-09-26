//In this program we are going to find the maximum subarray sum

public class maxsum {

  public static void main(String[] args){
    int[] arr = {-8, -3, -5, -2};
    int current_sum = -2;
    int max_sum = -2;
    int temp=0;
    int best_start=0;
    int best_end=0;

    for(int i=1; i< arr.length ;i++){
      int element = arr[i];
      int continu= current_sum + element;
      int start_new = element;

      if(continu <  start_new ){

        current_sum = start_new;

        temp = i;

      }

      else{
        current_sum= continu;
      }

      if(max_sum < current_sum){
        max_sum = current_sum;
        best_start = temp;
        best_end = i;
      }
    }

    System.out.println("Maximum sum : " +max_sum);
    for(int i=best_start ;i<=best_end; i++){

      System.out.print(arr[i] + " ");

    }
  }
  
}
