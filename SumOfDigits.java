import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter digit : ");
        int num = sc.nextInt();
        int sum = s.sumOfDigits(num);
        System.out.println("Sum of digits : ");
        System.out.println(sum);
    }
    static class Solution {
        static int sumOfDigits(int n) {
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            return sum;
        }
    }
}
