import java.util.Scanner;
import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution s = new Solution();

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int[] result = s.getConcatenation(nums);

        System.out.println(Arrays.toString(result));
    }

    static class Solution {
        public int[] getConcatenation(int[] nums) {
            int n = nums.length;
            int[] ans = new int[2 * n];
            for (int i = 0; i < n; i++) {
                ans[i] = nums[i];
                ans[i + n] = nums[i];
            }
            return ans;
        }
    }
}