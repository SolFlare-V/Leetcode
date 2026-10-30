
class Solution {
    public boolean checkDistances(String s, int[] distance) {
        int[] first = new int[26];

        for (int i = 0; i < 26; i++) {
            first[i] = -1;
        }

        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';

            if (first[index] == -1) {
                first[index] = i;
            } else {
                int diff = i - first[index] - 1;

                if (diff != distance[index]) {
                    return false;
                }
            }
        }

        return true;
    }
}
