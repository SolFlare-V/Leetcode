class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();
        HashMap<Character, Integer> h= new HashMap<>();
        if (n!=m){
            return false;
        } 
        for (int i=0;i<n; i++){
            h.put(s.charAt(i), h.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i=0;i<m; i++){
            if(h.containsKey(t.charAt(i)) && h.get(t.charAt(i)) > 0){
                h.put(t.charAt(i), h.get(t.charAt(i)) - 1);
                continue;
            }
            return false;
        }
        return true;
    }
}
