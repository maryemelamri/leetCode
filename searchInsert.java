class Solution {
    public int searchInsert(int[] nums, int target) {
        int res = 0;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] >= target) {
                return i;
            }
            i++;
        }
        return nums.length;
    }
}
