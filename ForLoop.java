class Solution {
    public static String isPrime(int n) {
        if(n<=1){
            return "No";
        }
        int i;
        for(i=2;i<n;i++){
            if(n%i == 0){
                return "No";
            }
        }
        return "Yes";
    }
}