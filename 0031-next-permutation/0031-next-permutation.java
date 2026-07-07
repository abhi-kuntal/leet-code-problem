class Solution {
    public void nextPermutation(int[] arr) {

        int pivot = -1;
        
        int n = arr.length-1;
        for(int i=n; i>0; i--){
            if(arr[i] > arr[i-1]){
              pivot = i-1;
              break;
            }
        }
        if(pivot == -1){
            Arrays.sort(arr);
            return;
        } 
        for(int i=n; i>0; i--){
            if(arr[pivot] < arr[i]){
                int temp = arr[i];
                arr[i] = arr[pivot];
                arr[pivot] = temp;
                break;
            }
        }

        int left = pivot+1;
        int right = n;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}