class Solution {
    public int[] twoSum(int[] num, int target) {
        int first=0;
        int last=num.length-1;

        while(first<last){
            int sum=num[first]+num[last];
            if(sum==target){
                return new int[] {first+1,last+1};
            }else if(sum < target ){
                first++;
            }else{
                last--;
            }
        }
        return new int[] {};

    }
}
