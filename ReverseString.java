import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string : ");
        String str = sc.nextLine();
        String rev = s.revStr(str);
        System.out.println("Reversed string : ");
        System.out.println(rev);
    }
    static class Solution {
        static String revStr(String s) {
            String rev = "";
            for (int i = s.length() - 1; i >= 0; i--) {
                rev = rev + s.charAt(i);
            }
            return rev;
        }
    }
}
