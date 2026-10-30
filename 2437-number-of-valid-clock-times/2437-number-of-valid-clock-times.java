
class Solution {
    public int countTime(String time) {
        int count = 0;

        for (int h = 0; h < 24; h++) {
            for (int m = 0; m < 60; m++) {

                String hour = String.format("%02d", h);
                String minute = String.format("%02d", m);

                String current = hour + ":" + minute;

                boolean valid = true;

                for (int i = 0; i < 5; i++) {
                    if (time.charAt(i) != '?' &&
                        time.charAt(i) != current.charAt(i)) {
                        valid = false;
                        break;
                    }
                }

                if (valid) {
                    count++;
                }
            }
        }

        return count;
    }
}
