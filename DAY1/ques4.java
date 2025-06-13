class ques4 {
    public int maxSubArray(int[] nums) {
        // int dp[] = new int[nums.length];
        // dp[0] = nums[0];
        // for(int i = 1;i<nums.length;i++){
        //     if(dp[i-1] > 0)
        //     dp[i] = dp[i-1] + nums[i];
        //     else
        //     dp[i] = nums[i];
        // }
        // int ans = dp[0];
        // for(int i = 0;i<dp.length;i++){
        //     ans = ans > dp[i] ? ans : dp[i];
        // }
        // return ans;

        int tot = nums[0], cur = 0;
        for(int i = 0;i<nums.length;i++){
            cur += nums[i];
            tot = cur > tot ? cur : tot;
            if(cur < 0){
                cur = 0;
            }
        }
        return tot;
    }
}