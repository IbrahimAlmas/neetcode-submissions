class Solution {
    public boolean isAnagram(String s, String t) {
        int lens=s.length();
        int lent=t.length();

        if(lens!= lent)return false;
        
        char chs[]=s.toCharArray();
        char cht[]=t.toCharArray();
        
        Arrays.sort(chs);
        Arrays.sort(cht);

        for(int i=0;i<lens;i++){
            if(chs[i]!=cht[i]){
                return false;
            }
        }
        return true;

    }
}
