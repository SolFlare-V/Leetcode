class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder str = new StringBuilder(s);
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == '(') {
                stack.push(i);

            } else if (str.charAt(i) == ')') {

                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    str.setCharAt(i, '#'); // mark invalid ')'
                }
            }
        }

        // Remaining '(' are invalid
        while (!stack.isEmpty()) {
            str.setCharAt(stack.pop(), '#');
        }

        // Build answer without '#'
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '#') {
                ans.append(str.charAt(i));
            }
        }

        return ans.toString();
    }
}