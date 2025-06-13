class ques2 {
    public double myPow(double x, int n) {
        double ans = helper(x, (long) n);
        return ans;
    }

    public double helper(double x, long n) {
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            return 1.0 / helper(x, -n);
        } else {
            if (n % 2 == 1) {
                return x * helper(x * x, (n - 1) / 2);
            } else {
                return helper(x * x, n / 2);
            }
        }
    }
}