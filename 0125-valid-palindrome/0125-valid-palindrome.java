class Solution {
    public boolean isPalindrome(String s) {

        String str = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                str += Character.toLowerCase(ch);
            }
        }

        String sr = new StringBuilder(str).reverse().toString();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != sr.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}