import java.util.Scanner;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        int result = sol.firstUniqChar(s);
        System.out.println(result);
    }
    static class Solution {
        public int firstUniqChar(String s) {
            for(int i=0;i<s.length();i++){
                char c = s.charAt(i);
                if(s.indexOf(c) == s.lastIndexOf(c)){
                    return i;
                }
            }
            return -1;
        }
    }
}