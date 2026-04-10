import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string : ");
        String S = sc.nextLine();
        System.out.println("Enter integer : ");
        int N = sc.nextInt();
        s.printIntString(S,N);
    }

    static class Solution {
        static void printIntString(String S, int N) {
            System.out.print("The input string :");
            System.out.println(S);
            System.out.print("The input integer :");
            System.out.println(N);
        }
    }
}