import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SmallerNumbersThanCurrent {
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

        int[] result = s.smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(result));
    }

    static class Solution {
        public int[] smallerNumbersThanCurrent(int[] nums) {
            int[] sorted = nums.clone();
            Arrays.sort(sorted);

            Map<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < sorted.length; i++) {
                map.putIfAbsent(sorted[i], i);
            }

            int[] result = new int[nums.length];

            for (int i = 0; i < nums.length; i++) {
                result[i] = map.get(nums[i]);
            }
            return result;
        }
    }
}