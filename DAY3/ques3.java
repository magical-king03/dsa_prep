class ques3 {
    public int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 1;
        for(int i = 1;i<nums.length;i++){
            if(count == 0){
                candidate = nums[i];
            }
            if(candidate == nums[i]){
                count++;
            }else{
                count--;
            }
            
        }
        return candidate;
    }
}