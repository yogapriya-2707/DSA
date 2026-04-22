import java.util.Scanner;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution s = new Solution();
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter sorted elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int result = s.removeDuplicates(nums);
        for (int i = 0; i < result; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    static class Solution {
        public int removeDuplicates(int[] nums) {
            int i = 0;
            if (nums.length == 0) {
                return 0;
            }
            for (int j = 1; j < nums.length; j++) {
                if (nums[j] != nums[i]) {
                    i++;
                    nums[i] = nums[j];
                }
            }
            return i + 1;
        }
    }
}