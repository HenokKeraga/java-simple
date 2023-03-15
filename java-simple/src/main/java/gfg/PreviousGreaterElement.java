package gfg;

import java.util.Arrays;
import java.util.LinkedList;

public class PreviousGreaterElement {
// stock span problem
    public static void main(String[] args) {

        System.out.println(Arrays.toString(previousGreatestE(new int[]{10, 4, 2, 20})));
    }

    public static int[] previousGreatestE(int[] input) {

        LinkedList<Integer> stack = new LinkedList<>();
        int[] result = new int[input.length];

        for (int i = 0; i < input.length; i++) {

            while (!stack.isEmpty()&&input[stack.peek()]<input[i]){
                stack.pop();
            }
         if(stack.isEmpty())
                result[i]=1+i;
            else {
                result[i]=i-stack.peek();
            }
            stack.push(i);

        }

        return result;

    }


}
