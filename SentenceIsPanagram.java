import java.util.Scanner;

public class SentenceIsPanagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution s = new Solution();

        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        boolean result = s.checkIfPangram(sentence);

        System.out.println(result);
    }

    static class Solution {
        public boolean checkIfPangram(String sentence) {
            boolean[] seen = new boolean[26];
            int count = 0;

            for (char ch : sentence.toCharArray()) {
                int index = ch - 'a';

                if (!seen[index]) {
                    seen[index] = true;
                    count++;
                }
            }

            return count == 26;
        }
    }
}