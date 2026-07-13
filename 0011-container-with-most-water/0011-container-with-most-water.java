class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;
        int i = 0;
        int j = height.length-1;

        while(i < j){
            int hig = Math.min(height[i], height[j]);
            int width = j -i ;
            int area = hig*width;
            maxWater = Math.max(area, maxWater);

            if(height[i] < height[j]){
                i++;
            }else{
                j--;
            }

        }
        return maxWater;
    }
}