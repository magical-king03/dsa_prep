class ques3 {
    public void nextPermutation(int[] nums) {
        int ind = -1;
        for(int i = nums.length-2;i>=0;i--){
            if(nums[i] < nums[i+1]){
                ind = i;
                break;
            }
        }
        if(ind!=-1){
            for(int i = nums.length-1;i>=ind;i--){
                if(nums[i] > nums[ind]){
                    int temp = nums[i];
                    nums[i] = nums[ind];
                    nums[ind] = temp;
                    break;
                }
            }
        }

        int start = ind+1, end = nums.length-1;
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}