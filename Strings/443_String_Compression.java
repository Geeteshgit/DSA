package Strings;

class Solution {
    public int compress(char[] chars) {
        int len = chars.length;
        if(len == 1) return 1;
        StringBuilder sb = new StringBuilder("");
        
        for(int i = 0; i < len; i++) {
           int count = 1;
           while(i < len - 1 && chars[i] == chars[i+1]) {
            count++;
            i++;
           }
           if(count == 1) sb.append(chars[i]);
           else {
            sb.append(chars[i]);
            sb.append(count);
           }
        }
        for(int i = 0; i < sb.length(); i++) {
            chars[i] = sb.charAt(i);
        }
        return sb.length();
    }
}
