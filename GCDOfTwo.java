import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a : ");
        int a = sc.nextInt();
        System.out.println("Enter number  : ");
        int b = sc.nextInt();
        int result = s.gcd(a,b);
        System.out.println(result);
    }

    static class Solution {
        public static int gcd(int a, int b) {
            if(b == 0){
                return a;
            }
            return gcd(b,a%b);
        }
    }
}
