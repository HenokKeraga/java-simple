package gfg;

public class DP {

    public static void main(String[] args) {
        System.out.println(addTheFirstNNumber(100));//12345
   ;
    }

    private static int addTheFirstNNumber(int n) {
        int[] dp = new int[n+1];
        dp[0]=0;

        for (int i = 1; i <= n; i++) {
            dp[i]=dp[i-1]+i;
        }
        return dp[n];
    }
}
