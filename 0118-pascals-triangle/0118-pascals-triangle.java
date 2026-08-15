class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> ans = new ArrayList<>();

        for (int n = 0; n < numRows; n++) {

            List<Integer> row = new ArrayList<>();

            for (int r = 0; r <= n; r++) {

                int value = combination(n, r);

                row.add(value);
            }

            ans.add(row);
        }

        return ans;
    }

    public int combination(int n, int r) {

        long result = 1;

        for (int i = 1; i <= r; i++) {

            result = result * (n - i + 1) / i;
        }

        return (int) result;
    }
}