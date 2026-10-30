//In this program we are finding the stock  prices span using STACK. 

import java.util.Stack;

public class stack {

  static int[] StackPrices(int[] prices) {
    int n = prices.length;
    int[] span = new int[n];
    Stack<Integer> st = new Stack<>();

    for (int i = 0; i < n; i++) {
      while (!st.isEmpty() && prices[st.peek()] <= prices[i]) {
        st.pop();

      }

      if (st.isEmpty()) {
        span[i] = i + 1;
      } else {
        span[i] = i - st.peek();
      }

      st.push(i);
    }

    return span;

  }

  public static void main(String[] args) {
    int[] prices = {100, 80, 60, 70, 60, 75, 85};
    int[] result = StackPrices(prices);
    int n = result.length;

    System.out.println("Array containing span values :");
    for (int i = 0; i < n; i++) {
      System.out.print(result[i] + " ");
    }
  }

}
