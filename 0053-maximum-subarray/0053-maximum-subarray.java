class Solution {
    public int maxSubArray(int[] arr) {
        int curr =0;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
             curr += arr[i];
             max = Math.max(curr,max);
             
              if(curr < 0){
             curr = 0;
        }

            }
        
          
        return max;
    }
}