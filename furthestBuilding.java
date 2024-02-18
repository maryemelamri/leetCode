class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
             int n = heights.length;
        PriorityQueue<Integer> ladderGaps = new PriorityQueue<>();

        for (int i = 0; i < n - 1; i++) {
            int diff = heights[i + 1] - heights[i];
            if (diff > 0) {
                if (ladders > 0) {
                    ladderGaps.offer(diff);
                    if (ladderGaps.size() > ladders) {
                        bricks -= ladderGaps.poll();
                        if (bricks < 0) {
                            return i;
                        }
                    }
                } else {
                    bricks -= diff;
                    if (bricks < 0) {
                        return i;
                    }
                }
            }
        }

        return n - 1;
    }
}
