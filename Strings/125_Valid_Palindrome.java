package Strings;

class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()) return true;
        int st = 0;
        int en = s.length() - 1;
        while(st <= en) {
            char curr1 = s.charAt(st);
            char curr2 = s.charAt(en);
            if(!Character.isLetterOrDigit(curr1)) {
                st++;
            }
            else if(!Character.isLetterOrDigit(curr2)) {
                en--;
            }
            else {
                if(Character.toLowerCase(curr1) != Character.toLowerCase(curr2)) {
                    return false;
                }
            st++;
            en--;
            }
        }
        return true;
    }
}
