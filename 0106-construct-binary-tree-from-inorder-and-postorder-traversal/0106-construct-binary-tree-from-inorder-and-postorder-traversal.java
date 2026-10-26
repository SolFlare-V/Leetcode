class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return build(inorder, 0, inorder.length - 1,
                     postorder, 0, postorder.length - 1);
    }

    private TreeNode build(int[] inorder, int inStart, int inEnd,
                           int[] postorder, int postStart, int postEnd) {

        if (inStart > inEnd || postStart > postEnd) {
            return null;
        }

        int rootValue = postorder[postEnd];
        TreeNode root = new TreeNode(rootValue);

        int rootIndex = inStart;

        while (inorder[rootIndex] != rootValue) {
            rootIndex++;
        }

        int leftSize = rootIndex - inStart;
        root.left = build(
            inorder,
            inStart,
            rootIndex - 1,
            postorder,
            postStart,
            postStart + leftSize - 1
        );

        root.right = build(
            inorder,
            rootIndex + 1,
            inEnd,
            postorder,
            postStart + leftSize,
            postEnd - 1
        );

        return root;
    }
}