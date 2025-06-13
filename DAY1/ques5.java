class ques5 {
    public void sortColors(int[] nums) {
        int[] freq = new int[3];
        for(int i = 0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        int k = 0;
        for(int i = 0 ;i<freq.length;i++){
            for(int j=0;j<freq[i];j++){
                nums[k] = i;
                k++;
            }
        }
    }
}