class Solution {
    public void setZeroes(int[][] arr) {
        boolean fstRow = false;
        boolean fstCol= false;

        for(int j=0; j<arr[0].length; j++){
            if(arr[0][j] == 0){
                fstRow = true;
            }
        }

         for(int i=0; i<arr.length; i++){
            if(arr[i][0] == 0){
                fstCol = true;
            }
        }
        
        for(int i=1; i<arr.length; i++){
            for(int j=1; j<arr[0].length; j++){
                if(arr[i][j] == 0){
                    arr[i][0] = 0;
                    arr[0][j] =0;
                }

            }
        }
        for(int i=1; i<arr.length; i++){
            for(int j=1; j<arr[0].length; j++){
                if(arr[i][0]==0 || arr[0][j]==0){
                    arr[i][j] = 0;
                }
            }
        }

        if(fstRow){
            for(int j=0; j<arr[0].length; j++){
                arr[0][j] = 0;
            }
        }
         if(fstCol){
            for(int i=0; i<arr.length; i++){
                arr[i][0] = 0;
            }
        }

    }
}