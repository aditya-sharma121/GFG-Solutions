class Solution {
    public int maxSubarrayXOR(int[] nums, int k) {
        // code here
        int max = Integer.MIN_VALUE;
        int xor=0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            xor ^= nums[i];
            
            if(i<k-1) continue;
            
            max = Math.max(max,xor);
            int sin = i-k+1;
            xor ^= nums[sin];
        }
        return max;
    }
}
