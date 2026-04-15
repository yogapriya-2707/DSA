import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number  : ");
        int num = sc.nextInt();
        int result = s.factorial(num);
        System.out.println(result);
    }

    static class Solution {
        int factorial(int n) {
            int fact = 1;
            for(int i = 1;i<=n;i++){
                fact = fact*i;
            }
            return fact;
        }
    }
}