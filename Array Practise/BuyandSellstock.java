//In tbhis program we are going to solve a problem Best Time to buy and and sell Stock in which i am finding the mazimum profit and the best buy and sell price.

import java.util.*;
public class BuyandSellstock {

  public static void maxprofit(int[] prices){

    int minprice = prices[0];
    int maxProfit = 0;
    int buyprice = prices[0];
    int sellprice = prices[0];

    for(int i=1;i<prices.length;i++){

      if(prices[i] < minprice){
        minprice = prices[i];
      }

      else{
        int profit = prices[i] - minprice;
        
        if(profit >maxProfit){
          maxProfit = profit;
          buyprice = minprice;
          sellprice = prices[i];
        }
      }
    }
    System.out.println("Buy at:"+buyprice);
    System.out.println("Sell at:"+sellprice);
    System.out.println("MaxProfit at:"+maxProfit);
  
  }

  public static void main(String[] args){

    int[] prices = {7,1,5,3,6,4};

    maxprofit(prices);
  }
  
}
