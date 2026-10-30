
class Solution {
    public boolean equationsPossible(String[] equations) {
        int[] parent = new int[26];

        for (int i = 0; i < 26; i++) {
            parent[i] = i;
        }

        for (String eq : equations) {
            if (eq.charAt(1) == '=') {
                int a = find(parent, eq.charAt(0) - 'a');
                int b = find(parent, eq.charAt(3) - 'a');

                parent[a] = b;
            }
        }

        for (String eq : equations) {
            if (eq.charAt(1) == '!') {
                int a = find(parent, eq.charAt(0) - 'a');
                int b = find(parent, eq.charAt(3) - 'a');

                if (a == b) {
                    return false;
                }
            }
        }

        return true;
    }

    private int find(int[] parent, int x) {
        if (parent[x] != x) {
            parent[x] = find(parent, parent[x]);
        }

        return parent[x];
    }
}
