class Solution {
    public int timeRequiredToBuy(int[] arr, int k) {
        int time = 0;
        while(arr[k] >0){

            for(int i=0; i<arr.length; i++){
                if(arr[i] > 0 ){
                    arr[i]--;
                    time++;
                }

                if(arr[k] == 0){
                    return time;
                }
            }
        }
        return time;

    }
}