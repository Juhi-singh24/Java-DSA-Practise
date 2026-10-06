public class Prefix_sum {

  public static void main(String[] args){

    int[] arr = {4, 7, 2, 9, 5, 3};
    int n = arr.length;
    System.out.println(n);
    int[] prefix = new int[n +1];
    System.out.println("Prefix length = " +prefix.length);
    int left = 2;
    int right = 5;
    int result;

    prefix[0] = 0;

    for(int i=1; i< prefix.length ;i++){

      prefix[i] = prefix[i - 1] + arr[i -1];
      System.out.println("Prefix index" + (i) + ":" + prefix[i] +"");

    }

    result = prefix[right + 1] - prefix[left];
    System.out.println("The sum from index 2 to 5 :" + result);

    
  }
  
}

