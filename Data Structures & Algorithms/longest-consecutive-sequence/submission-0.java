class Solution {

    public boolean contains(int[] nums,int target){
        for (int num:nums){
            if (target==num)
                return true;
        }
        return false;
    }
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        int longest =0;
        for(int i=0;i<n;i++){
            int curr=nums[i];
            int streak=1;

            while(contains(nums,curr+1)){
                curr++;
                streak++;
            }
            longest= Math.max(longest,streak);
        }
        return longest;
    }
}
