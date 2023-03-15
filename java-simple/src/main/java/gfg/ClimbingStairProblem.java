package gfg;

public class ClimbingStairProblem {
    public static void main(String[] args) {
        System.out.println(  waysOfClimbing(4,2));

    }

    private static int waysOfClimbing(int n,int k) {
        int[] input = new int[k];
        input[0]=1;

        for (int i = 1; i <=n; i++) {

         //   input[i]=input[i-1]+input[i-2]... input[i-k];

            for(int j=1;j<k;j++){
                if(i-j>=0){
                    input[i%k]+=input[(i-j)%k];
                }

            }
        }

        return input[n%k];
    }
}
