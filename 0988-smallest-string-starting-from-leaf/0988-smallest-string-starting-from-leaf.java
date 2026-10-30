
class Solution {
    String result = null;

    public String smallestFromLeaf(TreeNode root) {
        dfs(root, new StringBuilder());
        return result;
    }

    private void dfs(TreeNode node, StringBuilder sb) {
        if (node == null) {
            return;
        }

        sb.append((char) ('a' + node.val));

        if (node.left == null && node.right == null) {
            String current = sb.reverse().toString();

            if (result == null || current.compareTo(result) < 0) {
                result = current;
            }

            sb.reverse();
        }

        dfs(node.left, sb);
        dfs(node.right, sb);

        sb.deleteCharAt(sb.length() - 1);
    }
}
