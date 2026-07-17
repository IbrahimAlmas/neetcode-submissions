class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int maxlen=0;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=i;j<n;j++){
                boolean duplicate=false;

                for(int k=i;k<j;k++){

                    if(s.charAt(k)==s.charAt(j)){
                        duplicate =true;
                        break;
                    }
                }
                if(duplicate)
                        break;

                    count++;
                    maxlen=Math.max(maxlen,count);
            }
        }

        return maxlen;
    }
}
