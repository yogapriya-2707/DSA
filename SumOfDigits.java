class Solution {
    static int sumOfDigits(int N) {
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            int num = i;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
        }
        return sum;
    }
}