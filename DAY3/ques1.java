class ques1 {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                if(matrix[i][j] == target){
                    return true;
                }
            }
        }
        return false;

        // Optimal solution
        // int n = matrix.length;
        // int m = matrix[0].length;

        // int low = 0;
        // int high = (n * m - 1);
        // while(low <= high){
        //     int mid = (low + high) / 2;
        //     int row = mid / m, col = mid % m;
        //     if(matrix[row][col] == target) return true;
        //     else if(matrix[row][col] < target) low = mid + 1;
        //     else high = mid - 1;
        // }

        // return false;
    }
}