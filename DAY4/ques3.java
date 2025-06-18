import java.util.*;

class ques3{
    public int longestConsecutive(int[] nums) {
        // int cnt = 1, max = 1;
        // if(nums.length == 0){
        //     return 0;
        // }
        // Arrays.sort(nums);
        // for(int i = 0;i<nums.length-1;i++){
        //     if(i > 0 && nums[i] == nums[i+1]) continue;
        //     if(nums[i + 1] - nums[i] == 1){
        //         cnt++;
        //         max = Math.max(cnt, max);
        //     }else{
        //         cnt = 1;
        //     }
        // }
        // return max;

        int max = 1;
        if(nums.length == 0){
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int i : set){
            if(!(set.contains(i-1))){
                int cnt = 1;
                int x = i;
                while(set.contains(x+1)){
                    x = x + 1;
                    cnt++;
                }
            max = Math.max(max, cnt);
            }
        }
        return max;
    }
}