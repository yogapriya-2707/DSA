import java.util.Scanner;
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution s = new Solution();
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        s.insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static class Solution {
        public void insertionSort(int arr[]) {
            int n = arr.length;
            for (int i = 1; i < n; i++) {
                int temp = arr[i];
                int j = i - 1;
                while (j >= 0 && arr[j] > temp) {
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = temp;
            }
        }
    }
}