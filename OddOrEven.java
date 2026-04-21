import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int result = s.isEven(num);
        System.out.println(result);
    }
    static class Solution {
        int isEven(int n) {
            if (n % 2 == 0) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}