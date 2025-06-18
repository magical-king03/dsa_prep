import java.util.*;

class ques5 {
    public long subarrayXor(int arr[], int k) {
        // code here
        Map<Integer, Integer> map = new HashMap<>();
        int xr = 0, cnt = 0;
        map.put(xr, 1);
        
        for(int i = 0;i<arr.length;i++){
            xr = xr ^ arr[i];
            int x = xr ^ k;
            
            if(map.containsKey(x)){
                cnt += map.get(x);
            }
            
            if(map.containsKey(xr)){
                map.put(xr, map.get(xr) + 1);
            }else{
                map.put(xr, 1);
            }
        }
        
        return cnt;
    }
}