class Solution {
    public int numberOfBoomerangs(int[][] points) {

        int ans = 0;

        for (int i = 0; i < points.length; i++) {

            HashMap<Integer, Integer> map = new HashMap<>();

            for (int j = 0; j < points.length; j++) {

                if (i == j) {
                    continue;
                }

                int x = points[i][0] - points[j][0];
                int y = points[i][1] - points[j][1];

                int distance = x * x + y * y;

                map.put(distance, map.getOrDefault(distance, 0) + 1);
            }

            for (Integer distance : map.keySet()) {

                int count = map.get(distance);

                ans += count * (count - 1);
            }
        }

        return ans;
    }
}