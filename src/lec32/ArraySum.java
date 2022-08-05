package lec32;

class ArraySum {
    public double[] calculate(int[] brr) {
        int total = 0;

        for (int x : brr) {
            total += x;
        }

        double[] ans = new double[2];
        ans[0] = total;
        ans[1] = (double) total / brr.length;
        return ans;

    }

}
