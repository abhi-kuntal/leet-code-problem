class Solution {
    public int majorityElement(int[] arr) {
        int freq = 0;
        int curr = 0;

        for(int i =0; i<arr.length; i++){
            if(freq == 0){
                curr = arr[i];

            }
            if(arr[i]==curr){
                freq++;
            }else{
                freq--;
            }
        } 
        return curr;
        
    }
}