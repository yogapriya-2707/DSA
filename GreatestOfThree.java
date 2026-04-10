import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for a : ");
        int a = sc.nextInt();
        System.out.println("Enter value for b : ");
        int b = sc.nextInt();
        System.out.println("Enter value for c : ");
        int c = sc.nextInt();
        s.greatestOfThree(a,b,c);
    }

    static class Solution {
        public int greatestOfThree(int a, int b, int c) {
            if (a >= b && a >= c) {
                System.out.print(a);
                System.out.println(" is greatest among three");
            }
            else if (b >= a && b >= c) {
                System.out.print(b);
                System.out.println(" is greatest among three");
            }
            else {
                System.out.print(c);
                System.out.println(" is greatest among three");
            }
            return 0;
        }
    }
}
