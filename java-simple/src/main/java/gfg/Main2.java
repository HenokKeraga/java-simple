package gfg;

import java.util.HashSet;
import java.util.Set;

public class Main2 {

    public static void main(String[] args) {

        int[] x = new int[]{4,2,-3,1,6};
        System.out.println(arrayWithZeroSum(x));

    }

    public static boolean  arrayWithZeroSum(int[] array){


       Set<Integer> set  = new HashSet<>();

       int sum=0;

        for (int i = 0; i < array.length; i++) {

             sum+=array[i];
             if(set.contains(sum)){
                 return true;
             }

             set.add(sum);
        }


        return  false;
    }
}
