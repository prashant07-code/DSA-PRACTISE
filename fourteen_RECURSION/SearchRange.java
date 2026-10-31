package fourteen_RECURSION;

import java.util.Arrays;

public class SearchRange {

    // LeetCode 34: pehla aur aakhri index, O(log n)
    public static int[] searchRange(int[] nums, int target) {
        return new int[]{findFirst(nums, target), findLast(nums, target)};
    }

    private static int findFirst(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1, ans = -1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] == target) {
                ans = mid;          // answer save karo
                hi = mid - 1;       // aur left me dhoondho
            } else if (nums[mid] < target) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return ans;
    }

    private static int findLast(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1, ans = -1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] == target) {
                ans = mid;          // answer save karo
                lo = mid + 1;       // aur right me dhoondho
            } else if (nums[mid] < target) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};

        System.out.println(Arrays.toString(searchRange(nums, 8)));          // [3, 4]
        System.out.println(Arrays.toString(searchRange(nums, 6)));          // [-1, -1]
        System.out.println(Arrays.toString(searchRange(new int[]{}, 0)));   // [-1, -1]
        System.out.println(Arrays.toString(searchRange(new int[]{1}, 1)));  // [0, 0]
    }
}