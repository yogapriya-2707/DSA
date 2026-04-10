import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int number = sc.nextInt();
        int reverse = s.reverseDigits(number);
        System.out.println("Reversed digit : ");
        System.out.println(reverse);
    }
    static class Solution {
        public int reverseDigits(int n) {
            int reverse = 0;
            while (n > 0) {
                int digit = n % 10;
                reverse = reverse * 10 + digit;
                n = n / 10;
            }
            return reverse;
        }
    }
}
