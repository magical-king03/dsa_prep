import java.util.*;

class ques2 {
    public int[][] merge(int[][] intervals) {
        List<List<Integer>> res_list = new ArrayList<>();
        int n = intervals.length;
        Arrays.sort(intervals, new Comparator<int[]>(){
            public int compare(int a[], int b[]){
                return a[0] - b[0];
            }
        });

        for(int i = 0;i<n;i++){
            int start = intervals[i][0];
            int end = intervals[i][1];

            if(!res_list.isEmpty() && end <= res_list.get(res_list.size() - 1).get(1)){
                continue;
            }

            for(int j = i+1;j<n;j++){
                if(intervals[j][0] <= end){
                    end = Math.max(end, intervals[j][1]);
                }else{
                    break;
                }
            }
            res_list.add(Arrays.asList(start, end));
        }

        int[][] res = new int[res_list.size()][2];
        for(int i = 0;i<res_list.size();i++){
            res[i][0] = res_list.get(i).get(0);
            res[i][1] = res_list.get(i).get(1);
        }

        return res;
    }
}