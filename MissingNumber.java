import java.util.Scanner;
import java.util.HashSet;

public class MissingNumber {
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
        int result = s.missingNumber(arr);
        System.out.println(result);
    }

    static class Solution {
        public int missingNumber(int[] nums) {
            HashSet<Integer> set = new HashSet<>();
            for (int num : nums) {
                set.add(num);
            }
            for (int i = 0; i <= nums.length; i++) {
                if (!set.contains(i)) {
                    return i;
                }
            }
            return -1;
        }
    }
}