
class Solution {
    public boolean equalFrequency(String word) {
        int[] freq = new int[26];

        for (char ch : word.toCharArray()) {
            freq[ch - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] == 0) {
                continue;
            }

            freq[i]--;

            int common = 0;
            boolean valid = true;

            for (int j = 0; j < 26; j++) {
                if (freq[j] == 0) {
                    continue;
                }

                if (common == 0) {
                    common = freq[j];
                } else if (common != freq[j]) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                return true;
            }

            freq[i]++;
        }

        return false;
    }
}
