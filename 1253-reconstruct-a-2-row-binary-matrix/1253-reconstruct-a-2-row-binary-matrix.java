class Solution {
    public List<List<Integer>> reconstructMatrix(
            int upper, int lower, int[] colsum) {

        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> top = new ArrayList<>();
        List<Integer> bottom = new ArrayList<>();

        for (int i = 0; i < colsum.length; i++) {

            if (colsum[i] == 2) {
                top.add(1);
                bottom.add(1);

                upper--;
                lower--;

            } else {
                top.add(0);
                bottom.add(0);
            }
        }

        if (upper < 0 || lower < 0) {
            return new ArrayList<>();
        }

        for (int i = 0; i < colsum.length; i++) {

            if (colsum[i] == 1) {

                if (upper > 0) {
                    top.set(i, 1);
                    upper--;

                } else if (lower > 0) {
                    bottom.set(i, 1);
                    lower--;

                } else {
                    return new ArrayList<>();
                }
            }
        }

        if (upper != 0 || lower != 0) {
            return new ArrayList<>();
        }

        ans.add(top);
        ans.add(bottom);

        return ans;
    }
}