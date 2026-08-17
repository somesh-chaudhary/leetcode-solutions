class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        int j = 0;
        Deque<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            while (!queue.isEmpty() && queue.peekFirst() <= i - k)
                queue.removeFirst();
            while (!queue.isEmpty() && nums[queue.peekLast()] <= nums[i])
                queue.removeLast();
            queue.addLast(i);
            if (i >= k - 1)
                ans[j++] = nums[queue.peekFirst()];
        }
        return ans;
    }
}