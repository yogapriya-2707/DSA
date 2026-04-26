import java.util.Scanner;
import java.util.HashMap;

public class LongestSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();
        System.out.println("Enter a string : ");
        String st = sc.nextLine();
        int result = sol.lengthOfLongestSubstring(st);
        System.out.println(result);
    }

    static class Solution {
        public int lengthOfLongestSubstring(String s) {
            HashMap<Character,Integer> map = new HashMap<>();
            int i = 0;
            int leng = 0;
            for (int j = 0; j < s.length(); j++) {
                if (map.containsKey(s.charAt(j))) {
                    i = Math.max(i,map.get(s.charAt(j))+ 1);
                }
                map.put(s.charAt(j), j);
                leng = Math.max(leng, j - i + 1);
            }
            return leng;
        }
    }
}