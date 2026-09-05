class Solution {
    public String reversePrefix(String s, int k) {

        StringBuilder app = new StringBuilder();

        for (int i = 0; i < k; i++) {
            app.append(s.charAt(i));
        }

        app.reverse();

        app.append(s.substring(k));

        return app.toString();
    }
}