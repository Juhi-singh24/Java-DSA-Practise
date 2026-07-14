//In this program we are going to solve a problem Prefix sum.

public class prefix_sum {

  public static int[] buildprefixsum(int[] arr){

    int [] prefix = new int[arr.length];

    prefix[0] = arr[0];

    for (int i =1;i<arr.length;i++){
      prefix[i] = prefix[i-1] +arr[i];
    }

    return prefix;
  } 

  public static void main(String[] args){

    int[] arr = {2,3,5,1,7};

    int[] result = buildprefixsum(arr);

    for (int num : result) {
    System.out.print(num + " ");
    }
  }
  
}
