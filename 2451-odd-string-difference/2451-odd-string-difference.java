
class Solution {
    public String oddString(String[] words) {
        int n = words.length;

        int[] first = getDifference(words[0]);
        int[] second = getDifference(words[1]);

        int[] common;

        if (same(first, second)) {
            common = first;
        } else {
            int[] third = getDifference(words[2]);

            if (same(first, third)) {
                return words[1];
            } else {
                return words[0];
            }
        }

        for (int i = 2; i < n; i++) {
            int[] current = getDifference(words[i]);

            if (!same(common, current)) {
                return words[i];
            }
        }

        return "";
    }

    private int[] getDifference(String word) {
        int[] diff = new int[word.length() - 1];

        for (int i = 0; i < word.length() - 1; i++) {
            diff[i] = word.charAt(i + 1) - word.charAt(i);
        }

        return diff;
    }

    private boolean same(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }
}
