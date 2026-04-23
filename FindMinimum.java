import java.util.Scanner;

public class FindMinimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution s = new Solution();
        System.out.println("Enter number of elements : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements : ");
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        int result = s.findMin(arr);
        System.out.println(result);
    }

    static class Solution {
        public int findMin(int[] nums) {
            int min = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < min) {
                    min = nums[i];
                }
            }
            return min;
        }
    }
}