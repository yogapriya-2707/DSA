import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for n: ");
        int n = sc.nextInt();
        System.out.println("Enter value for m : ");
        int m = sc.nextInt();
        String result = s.compareNM(n,m);
        System.out.println("Result : ");
        System.out.println(result);
    }

    static class Solution {
        public static String compareNM(int n, int m) {
            if(n < m){
                return "lesser";
            }
            else if(n == m){
                return "equal";
            }
            else{
                return "greater";
            }
        }
    }
}
