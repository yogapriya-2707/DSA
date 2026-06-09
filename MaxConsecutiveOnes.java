import java.util.Scanner;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution s = new Solution();

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter binary array elements (0s and 1s):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = s.findMaxConsecutiveOnes(nums);
        System.out.println(result);
    }

    static class Solution {
        public int findMaxConsecutiveOnes(int[] nums) {
            int maxCount = 0;
            int currentCount = 0;
            for (int num : nums) {
                if (num == 1) {
                    currentCount++;
                    maxCount = Math.max(maxCount, currentCount);
                } else {
                    currentCount = 0;
                }
            }
            return maxCount;
        }
    }
}