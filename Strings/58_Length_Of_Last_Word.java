package Strings;

class Solution {
    public int lengthOfLastWord(String s) {
        String str = s.trim();
        int len = str.length();
        int p = len - 1;
        int count = 0;
        while(p >= 0 && str.charAt(p) != ' ') {
            count++;
            p--;
        }
        return count;
    }
}
