class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int n = arr.length;
        int max = Integer.MIN_VALUE;
         int sum=0;
         for(int i=0;i<n;i++){
             sum += arr[i];
             if(i<k-1) continue;
             
             max = Math.max(max,sum);
             int sin = i-k+1;
             sum -= arr[sin];
         }
         return max;
    }
}