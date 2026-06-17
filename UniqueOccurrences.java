import java.util.Scanner;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution s = new Solution();

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean result = s.uniqueOccurrences(arr);

        System.out.println(result);
    }

    static class Solution {
        public boolean uniqueOccurrences(int[] arr) {
            Map<Integer, Integer> freq = new HashMap<>();

            for (int num : arr) {
                freq.put(num, freq.getOrDefault(num, 0) + 1);
            }

            Set<Integer> counts = new HashSet<>(freq.values());

            return counts.size() == freq.size();
        }
    }
}