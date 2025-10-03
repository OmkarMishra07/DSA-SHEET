class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int min_len = Integer.MAX_VALUE;
        int start = 0;
        int sum = 0;

        for (int end = 0; end < n; end++) {
            sum += nums[end];
            while (sum >= target) {
                min_len = Math.min(min_len, end - start + 1);
                sum -= nums[start];
                start++;
            }
        }
        return (min_len == Integer.MAX_VALUE) ? 0 : min_len;
    }
}
