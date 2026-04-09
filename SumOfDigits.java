class Solution {
    static int sumOfDigits(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int num = i;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
        }
        return sum;
    }
}
