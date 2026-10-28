class Solution {
    public int longestPalindrome(String s, String t) {
        int n = s.length();
        int m = t.length();

        int[] palS = getPalindromes(s);

        t = new StringBuilder(t).reverse().toString();

        int[] palT = getPalindromes(t);

        int ans = 1;

        for (int x : palS) {
            ans = Math.max(ans, x);
        }

        for (int x : palT) {
            ans = Math.max(ans, x);
        }

        int[][] dp = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {

                if (s.charAt(i - 1) == t.charAt(j - 1)) {

                    dp[i][j] = dp[i - 1][j - 1] + 1;

                    int pairs = dp[i][j];

                    ans = Math.max(ans, 2 * pairs);
                    if (i < n) {
                        ans = Math.max(
                            ans,
                            2 * pairs + palS[i]
                        );
                    }

                    if (j < m) {
                        ans = Math.max(
                            ans,
                            2 * pairs + palT[j]
                        );
                    }
                }
            }
        }

        return ans;
    }

    private int[] getPalindromes(String s) {
        int n = s.length();
        int[] best = new int[n];

        for (int center = 0; center < n; center++) {

            expand(s, center, center, best);

            expand(s, center, center + 1, best);
        }

        return best;
    }

    private void expand(String s, int left, int right, int[] best) {

        while (left >= 0 &&
               right < s.length() &&
               s.charAt(left) == s.charAt(right)) {

            int length = right - left + 1;

            best[left] = Math.max(best[left], length);

            left--;
            right++;
        }
    }
}