import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number  : ");
        int num = sc.nextInt();
        long result = s.divSum(num);
        System.out.println(result);
    }

    static class Solution {
        static long divSum(long n) {
            long sum = 0;
            for(int i=1;i<n;i++){
                if(n%i==0)
                    sum += i;
            }
            return sum;
        }
    }
}
