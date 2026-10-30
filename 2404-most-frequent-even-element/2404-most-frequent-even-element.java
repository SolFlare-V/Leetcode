
import java.util.*;

class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int result = -1;
        int maxFreq = 0;

        for (int num : nums) {
            if (num % 2 == 0) {
                map.put(num, map.getOrDefault(num, 0) + 1);

                int freq = map.get(num);

                if (freq > maxFreq || 
                    (freq == maxFreq && (result == -1 || num < result))) {
                    maxFreq = freq;
                    result = num;
                }
            }
        }

        return result;
    }
}
