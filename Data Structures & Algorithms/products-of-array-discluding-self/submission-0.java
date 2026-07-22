class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] prefixSum = new int[n];
        prefixSum[0] = 1;

        int[] suffixSum = new int[n];
        suffixSum[n - 1] = 1;

        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i-1] * nums[i-1];
        }

        for(int i=n-2; i >= 0; i--){
            suffixSum[i] = suffixSum[i+1] * nums[i+1];
        }

        int[] result = new int[n];

        for(int i=0; i<n; i++){
            result[i] = prefixSum[i] * suffixSum[i];
        }
        
        return result;
    }
}
