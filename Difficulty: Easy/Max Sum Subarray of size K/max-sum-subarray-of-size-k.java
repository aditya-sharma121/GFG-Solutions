class Solution {
    public int maxSubarraySum(int[] nums, int k) {
        // Code here
         int n = nums.length;
         int max = Integer.MIN_VALUE;
         int sum=0;
         for(int i=0;i<n;i++){
             sum += nums[i];
             
             if(i<k-1) continue;
             max = Math.max(max,sum);
             int sin = i-k+1;
             sum -= nums[sin];
         }
         return max;
    }
}