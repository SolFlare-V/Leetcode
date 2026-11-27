
class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder str = new StringBuilder();

        // Remove dashes and convert to uppercase
        for (char c : s.toCharArray()) {
            if (c != '-') {
                str.append(Character.toUpperCase(c));
            }
        }

        StringBuilder result = new StringBuilder();

        // Traverse from right to left
        for (int i = str.length() - 1; i >= 0; i--) {
            result.append(str.charAt(i));

            if (i > 0 && (str.length() - i) % k == 0) {
                result.append('-');
            }
        }

        return result.reverse().toString();
    }
}
