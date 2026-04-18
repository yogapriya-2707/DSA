import java.util.Scanner;
import java.util.ArrayList;

public class MinMax {
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
        ArrayList<Integer> result = s.getMinMax(arr);
        System.out.println("Minimum,maximum elements in the array : ");
        System.out.println(result);
    }
    static class Solution {
        public ArrayList<Integer> getMinMax(int[] arr) {
            int min = arr[0];
            int max = arr[0];

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            ArrayList<Integer> result = new ArrayList<>();
            result.add(min);
            result.add(max);
            return result;
        }
    }
}
