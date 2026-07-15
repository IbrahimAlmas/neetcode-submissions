class Solution {
    public int maxArea(int[] height) {
        int first=0; 
        int last=height.length-1;
        int maxvol=0;

        while(first<last){
            int vol=(last-first)*Math.min(height[first],height[last]);
            maxvol=Math.max(maxvol,vol);

            if(height[first]<height[last]){
                first++;
            }else{
                last--;
            }
        }
        return maxvol;
    }
}
