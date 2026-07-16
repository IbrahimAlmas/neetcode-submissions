class Solution {
    public int maxProfit(int[] pr) {
        int max = 0;
        int n = pr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (pr[j] - pr[i] > 0) {
                    max = Math.max(max, pr[j] - pr[i]);
                }
            }
        }
        return max;
    }
}
