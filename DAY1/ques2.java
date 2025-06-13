import java.util.*;

class ques2 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        int dp[][] = new int[numRows][numRows];
        dp[0][0] = 1;
        for(int i = 1;i<numRows;i++){
            for(int j = 0;j<i+1;j++){
                if(j == 0){
                    dp[i][j] = 1;
                }else{
                    dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
                }
            }
        }

        for(int i = 0;i<numRows;i++){
            ans.clear();
            for(int j = 0;j<numRows;j++){
                if(dp[i][j] != 0){
                    ans.add(dp[i][j]);
                }
            }
            result.add(new ArrayList<>(ans));
        }

        return result;
    }
}