import java.util.Scanner;
import java.util.HashSet;

public class FindDuplicate {
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
        int result = s.findDuplicate(arr);
        System.out.println(result);
    }

    static class Solution {
        public int findDuplicate(int[] nums) {
            HashSet<Integer> set = new HashSet<>();
            for (int num : nums) {
                if (set.contains(num)) {
                    return num;
                }
                set.add(num);
            }
            return -1;
        }
    }
}