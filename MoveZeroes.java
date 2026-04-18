import java.util.*;

public class MoveZeroes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution s = new Solution();
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        s.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    static class Solution {
        public void moveZeroes(int[] nums) {
            int j = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    j++;
                }
            }
        }
    }
}