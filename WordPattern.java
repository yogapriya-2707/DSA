import java.util.Scanner;
import java.util.HashMap;

public class WordPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution s = new Solution();

        System.out.println("Enter pattern:");
        String pattern = sc.nextLine();

        System.out.println("Enter string:");
        String str = sc.nextLine();

        boolean result = s.wordPattern(pattern, str);
        System.out.println(result);
    }

    static class Solution {
        public boolean wordPattern(String pattern, String str) {
            String[] words = str.split(" ");

            if (pattern.length() != words.length)
                return false;

            HashMap<Character, String> map1 = new HashMap<>();
            HashMap<String, Character> map2 = new HashMap<>();

            for (int i = 0; i < pattern.length(); i++) {
                char ch = pattern.charAt(i);

                if (map1.containsKey(ch) && !map1.get(ch).equals(words[i]))
                    return false;

                if (map2.containsKey(words[i]) && map2.get(words[i]) != ch)
                    return false;

                map1.put(ch, words[i]);
                map2.put(words[i], ch);
            }
            return true;
        }
    }
}