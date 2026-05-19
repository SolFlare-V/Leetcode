import java.util.*;
class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> h= new HashMap<>();
        for (int i = 0; i<s.length();i++){
            char ch = s.charAt(i);
            if(h.containsKey(ch)){
                h.put(ch,h.get(ch)+1);
            }
            else{
                h.put(ch,1);
            }
            
        }
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(h.get(ch) == 1){
                    return i;
                }
            
        }
        return -1;
    }
}