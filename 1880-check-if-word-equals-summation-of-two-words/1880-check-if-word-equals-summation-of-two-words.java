class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return value(firstWord) + value(secondWord) == value(targetWord);
    }

    private int value(String word) {
        int num = 0;

        for (char c : word.toCharArray()) {
            num = num * 10 + (c - 'a');
        }

        return num;
    }
}