package gfg;

import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        int[] input = new int[]{10,8,0,0,1,0,4};

        System.out.println(Arrays.toString(moveZeroToTheEnd(input)));
    }

    public static int[] moveZeroToTheEnd(int[] input){



        for (int i = 0,count=0; i < input.length; i++) {
            if(input[i]!=0 ) {
                int a=input[count];
                input[count]=input[i];
                input[i]=a;
                count++;
            }
        }



        return input;
    }
}
