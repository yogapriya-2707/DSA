import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string  : ");
        String S = sc.nextLine();
        boolean result = s.isPalindrome(S);
        System.out.println(result);
    }

    static class Solution {
        boolean isPalindrome(String s) {
            int i, n=s.length();
            for(i=0;i<n/2;i++){
                if(s.charAt(i) != s.charAt(n-i-1)){
                    return false;
                }
            }
            return true;
        }
    }
}