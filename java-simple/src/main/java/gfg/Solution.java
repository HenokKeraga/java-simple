package gfg;

import java.util.*;

public  class Solution {

    public static void main(String[] args) {
        System.out.println(maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7},3));
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if (n * k == 0) return new int[0];
        if (k == 1) return nums;

        Deque<Integer> deque = new ArrayDeque<>();
        int[] result = new int[n - k + 1];

        for (int i = 0; i < n; i++) {
            // remove elements that are outside the window
            while (!deque.isEmpty() && deque.peek() < i - k + 1) {
                deque.poll();
            }

            // remove smaller elements from the end of the deque
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            // add the current element to the deque
            deque.offer(i);

            // add the maximum element to the result array
            if (i >= k - 1) {
                result[i - k + 1] = nums[deque.peek()];
            }
        }

        return result;
    }
}
