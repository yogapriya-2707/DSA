import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] num = new int[n];
        System.out.println("Enter elements : ");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        int result = s.largest(num);
        System.out.println("Largest Number : ");
        System.out.println(result);
    }

    static class Solution {
        public static int largest(int[] arr) {
            int n = arr.length;
            int i;
            int large = 0;
            for(i=0 ; i<n ; i++){
                if(arr[i]>large){
                    large = arr[i];
                }
            }
            return large;
        }
    }
}
