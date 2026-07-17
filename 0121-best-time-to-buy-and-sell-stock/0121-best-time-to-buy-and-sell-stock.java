class Solution {
    public int maxProfit(int[] arr) {
      int bestBuy = arr[0];
      int profit = 0;

     for(int i =1; i < arr.length; i++){
         
        profit = Math.max(profit , arr[i] - bestBuy);
        bestBuy = Math.min(arr[i], bestBuy);
     }
     return profit
     ;
    }
}