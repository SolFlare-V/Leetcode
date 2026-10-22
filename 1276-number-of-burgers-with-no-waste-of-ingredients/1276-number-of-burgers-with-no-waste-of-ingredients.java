class Solution {
    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {

        List<Integer> ans = new ArrayList<>();

        // Impossible if tomatoes are less than the minimum required
        if (tomatoSlices < 2 * cheeseSlices) {
            return ans;
        }

        // Impossible if tomatoes are more than the maximum possible
        if (tomatoSlices > 4 * cheeseSlices) {
            return ans;
        }

        // Number of jumbo burgers
        int jumbo = (tomatoSlices - 2 * cheeseSlices) / 2;

        // Number of small burgers
        int small = cheeseSlices - jumbo;

        // Check divisibility
        if ((tomatoSlices - 2 * cheeseSlices) % 2 != 0) {
            return ans;
        }

        ans.add(jumbo);
        ans.add(small);

        return ans;
    }
}