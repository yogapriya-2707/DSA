import java.util.Scanner;

public class RemoveOutermostParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution s = new Solution();

        System.out.println("Enter a valid parentheses string:");
        String str = sc.nextLine();

        String result = s.removeOuterParentheses(str);

        System.out.println(result);
    }

    static class Solution {
        public String removeOuterParentheses(String s) {
            StringBuilder result = new StringBuilder();
            int depth = 0;
            for (char ch : s.toCharArray()) {
                if (ch == '(') {
                    if (depth > 0) {
                        result.append(ch);
                    }
                    depth++;
                } else {
                    depth--;
                    if (depth > 0) {
                        result.append(ch);
                    }
                }
            }
            return result.toString();
        }
    }
}
