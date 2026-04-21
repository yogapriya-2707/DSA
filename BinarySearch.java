import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution s = new Solution();
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter sorted elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter element to search: ");
        int k = sc.nextInt();
        boolean result = Solution.searchInSorted(arr, k);
        if (result) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
    static class Solution {
        static boolean searchInSorted(int arr[], int k) {
            int left = 0;
            int right = arr.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (arr[mid] == k) {
                    return true;
                } else if (arr[mid] < k) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            return false;
        }
    }
}