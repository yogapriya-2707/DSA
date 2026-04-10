import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        s.calculateMultiples(num);
    }

    static class Solution {
        public void calculateMultiples(int n) {
            int i = 10;

            while (i >= 1) {
                System.out.print(n * i + " ");
                i--;
            }
        }
    }
}
