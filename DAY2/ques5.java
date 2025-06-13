import java.util.*;

class ques5 {
    ArrayList<Integer> findTwoElement(int arr[]) {
        long n = arr.length;
        long Sn = (n * (n + 1)) / 2;
        long S2n = (n * (n + 1) * (2 * n + 1)) / 6;
        long S = 0;
        long S2 = 0;
        for (int i = 0; i < n; i++) {
            S = S + arr[i];
            S2 = S2 + ((long) arr[i] * (long) arr[i]);
        }
        long val1 = S - Sn;
        long val2 = S2 - S2n;

        val2 = val2 / val1;

        long x = (val1 + val2) / 2;
        long y = x - val1;
        ArrayList<Integer> res = new ArrayList<>();
        res.add((int) x);
        res.add((int) y);
        return res;
    }
}
