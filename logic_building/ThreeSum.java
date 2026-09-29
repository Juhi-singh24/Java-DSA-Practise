//In this program we have given a sorted array, and we have to determine whether there are three different value whose sum is equals the target.

public class ThreeSum {

  public static void main(String[] args){
    int[] arr = {2,4,7,11,15,18,21};
    int target = 30;
    int n = arr.length;
    int i;
    int left;
    int right;
    int found=0;

    for(i=0; i<n; i++){

      left= i+1;
      right = n -1;
      int diff = target - arr[i];

      while(left < right){

        int sum = arr[left] + arr[right];
        

        if(sum == diff){
          found=1;
          break;
        }

        else if(sum < diff){
          left++;
        }

        else{
          right--;
        }



      }

       if(found == 1){
      System.out.println("We found the values");
      System.out.println("the three differnt values whose sum is equal to target 30 : " + arr[i] );
      System.out.println("Second value : " +arr[left]);
      System.out.println("Third value : " +arr[right]);
      break;
    }



    
    }

   
    
  }
  
}
