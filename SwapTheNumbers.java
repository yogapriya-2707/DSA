import java.util.Scanner;

public class SwapTheNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution s = new Solution();
        System.out.println("Enter a value for a : ");
        int a = sc.nextInt();
        System.out.println("Enter a value for b : ");
        int b = sc.nextInt();
        s.swap(a,b);
    }
    static class Solution {
        public void swap(int a, int b) {
            int c = a;
            a = b;
            b = c;
            System.out.println(a + " " + b);
        }
    }
}