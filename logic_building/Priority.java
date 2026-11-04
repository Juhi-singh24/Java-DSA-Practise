//In this program we are going to find the kth largest element using priority queue(min heap).

import java.util.PriorityQueue;
class Priority{

  static int Secondlargest(int[] arr, int k){
    int n= arr.length;
    PriorityQueue<Integer> q = new PriorityQueue<>();

    for(int i=0; i<n; i++){

      if(q.size() < k){
          q.offer(arr[i]);
        }

      else if(q.size() == k){
        if(arr[i] > q.peek()){
          q.poll();
          q.offer(arr[i]);

        }
      }

    }

    return  q.peek();
   }
  public static void main(String[] args){

    int[] arr ={5,7,3,8,9};
    int k=2;
    int secondMaximum = Secondlargest(arr,k);

    System.out.println("Second largest element: " + secondMaximum);

  }
}