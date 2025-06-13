import java.util.*;

class ques4 {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int n = nums.length;
        int cnt1 = 0, cnt2 = 0, ele1 = 0, ele2 = 0;
        for (int i = 0; i < n; i++) {
            if (cnt1 == 0 && ele2 != nums[i]) {
                ele1 = nums[i];
                cnt1++;
            } else if (cnt2 == 0 && ele1 != nums[i]) {
                ele2 = nums[i];
                cnt2++;
            } else if (ele1 == nums[i]) {
                cnt1++;
            } else if (ele2 == nums[i]) {
                cnt2++;
            } else {
                cnt1--;
                cnt2--;
            }
        }
        int f1 = 0, f2 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == ele1)
                f1++;
            if (nums[i] == ele2)
                f2++;
        }
        if (ele1 == ele2) {
            res.add(ele1);
        } else {
            if (f1 > (n / 3))
                res.add(ele1);
            if (f2 > (n / 3))
                res.add(ele2);
        }
        return res;
    }
}