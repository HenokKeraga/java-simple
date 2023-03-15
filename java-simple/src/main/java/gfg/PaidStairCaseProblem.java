package gfg;

import java.util.ArrayList;
import java.util.Arrays;

public class PaidStairCaseProblem {

    public static void main(String[] args) {

        System.out.println(cheapestAmount(3, new int[]{0,3,2,4}));

    }
    public static int cheapestAmount(int n , int[] payment){

      int[] minPayment = new int[n+1];
      int[] from= new int[n+1];

      minPayment[0]=0;
      from[0]=0;
      minPayment[1]=payment[1];
      from[1]=0;

        for (int i = 2; i <= n; i++) {
            minPayment[i]=payment[i]+Math.min(minPayment[i-1],minPayment[i-2]);
            if(minPayment[i-1]<minPayment[i-2]){
                from[i]=i-1;
            }else {
                from[i]=i-2;
            }

        }

        System.out.println(Arrays.toString(from));

        var arrayList = new ArrayList<Object>();
        int i=n;
        while (i>=0){
            arrayList.add(i);
            if(i==0)
                break;
            i=from[i];

        }
        //optimum solution
        System.out.println(arrayList);

        return  minPayment[n];
    }
}
