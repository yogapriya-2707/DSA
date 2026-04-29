import java.util.Scanner;
import java.util.Arrays;

public class GCDInArray {
    void main() {
        Scanner sc = new Scanner(System.in);
        Solution s = new Solution();
        System.out.println("Enter number of elements : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements : ");
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        int result = s.findGCD(arr);
        System.out.println(result);
    }

    static class Solution {
        public int findGCD(int[] nums) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] < min) {
                    min = nums[i];
                }
                if (nums[i] > max) {
                    max = nums[i];
                }
            }
            int result = gcd(min, max);
            return result;
        }

        public int gcd(int a, int b) {
            int result = 1;

            for (int i = 1; i <= Math.min(a, b); i++) {
                if (a % i == 0 && b % i == 0) {
                    result = i;
                }
            }

            return result;
        }
    }
}