class Solution {
    public int[] nextGreaterElement(int[] num1, int[] num2) {

        int[] ans = new int[num1.length];

        for(int i = 0; i < num1.length; i++) {

            int curr = num1[i];

          
            for(int j = 0; j < num2.length; j++) {

                if(num2[j] == curr) {

                    ans[i] = -1;

                 
                    for(int k = j + 1; k < num2.length; k++) {

                        if(num2[k] > curr) {
                            ans[i] = num2[k];
                            break;
                        }
                    }

                    break;
                }
            }
        }

        return ans;
    }
}