class Solution {
    public static int largest(int[] arr) {
        int n = arr.length;
        int i;
        int large = 0;
        for(i=0 ; i<n ; i++){
            if(arr[i]>large){
                large = arr[i];
            }
        }
        return large;
    }
}