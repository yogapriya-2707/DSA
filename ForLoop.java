import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        String result = s.isPrime(n);
        System.out.println(result);
    }

    static class Solution {
        public static String isPrime(int n) {
            if(n<=1){
                return "No";
            }
            int i;
            for(i=2;i<n;i++){
                if(n%i == 0){
                    return "No";
                }
            }
            return "Yes";
        }
    }
}
