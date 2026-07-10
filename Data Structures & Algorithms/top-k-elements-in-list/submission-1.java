class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        int indx=0;
        int[] out=new int[k];
        for(int i=0;i<n;i++){
            int count=0;
            for (int j=0;j<n;j++){
                if(nums[i]==nums[j])
                    count++;
            }
            boolean exist=false;
            for(int l=0;l<indx;l++){
                if(out[l]==nums[i]){
                    exist=true;
                    break;
                }
            }
            if (indx < k && !exist){
                int frequencyRank = 0;
                java.util.Set<Integer> seen = new java.util.HashSet<>();
                for (int val : nums) {
                    if (!seen.contains(val)) {
                        seen.add(val);
                        int c = 0;
                        for (int v : nums) if (v == val) c++;
                        if (c > count) frequencyRank++;
                    }
                }
                if (frequencyRank < k) {
                    out[indx]=nums[i];
                    indx++;
                }
            }
        }

        return out;
    }
}