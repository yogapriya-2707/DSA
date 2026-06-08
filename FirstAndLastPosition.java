import java.util.Scanner;
import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution s = new Solution();

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter target:");
        int target = sc.nextInt();

        int[] result = s.searchRange(nums, target);

        System.out.println(Arrays.toString(result));
    }

    static class Solution {
        public int[] searchRange(int[] nums, int target) {
            return new int[]{find(nums, target, true), find(nums, target, false)};
        }

        private int find(int[] nums, int target, boolean first) {
            int left = 0, right = nums.length - 1, ans = -1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (nums[mid] == target) {
                    ans = mid;

                    if (first)
                        right = mid - 1; // search left half
                    else
                        left = mid + 1;  // search right half

                } else if (nums[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            return ans;
        }
    }
}