class Solution {
    public int[] nextGreaterElements(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();

        int ans[] = new int[n];

        for(int i = 2*n-1; i>=0; i--){
            int idx = i%n;

            while(!st.isEmpty() && arr[idx] >= st.peek()){
                st.pop();
            }

            if(i<n){

            if(!st.isEmpty()){
                ans[idx] = st.peek();
            }else{
                 ans[idx] = -1;
            }
            }
            st.push(arr[idx]);
        }
        return ans;
    }
}