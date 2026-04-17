import java.util.Scanner;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();
        System.out.print("Enter first string: ");
        String s = sc.nextLine();
        System.out.print("Enter second string: ");
        String t = sc.nextLine();
        boolean result = sol.isAnagram(s, t);
        System.out.println(result);
    }

    static class Solution {
        public boolean isAnagram(String s, String t) {
            if (s.length() != t.length()) {
                return false;
            }
            char[] a = s.toCharArray();
            char[] b = t.toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            return Arrays.equals(a, b);
        }
    }
}