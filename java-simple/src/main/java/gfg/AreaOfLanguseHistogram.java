package gfg;

import java.util.Arrays;
import java.util.LinkedList;

public class AreaOfLanguseHistogram {

    public static void main(String[] args) {

        int[] input = new int[]{1,1};

       int[] prevSmallerElm=  previousSmallerElement(input);
       int[] nextSmallerElm = nextSmallerElement(input);
        System.out.println(Arrays.toString(prevSmallerElm));
        System.out.println(Arrays.toString(nextSmallerElm));

        System.out.println(calculateMaxArea(prevSmallerElm,nextSmallerElm,input));

    }


    private static int[] nextSmallerElement(int[] input) {

        int[] result = new int[input.length];

        LinkedList<Integer> stack = new LinkedList<>();

        for (int i = input.length -1; i >=0; i--) {

            while (!stack.isEmpty()&& input[stack.peek()]>=input[i])
                stack.pop();

           if(stack.isEmpty())
               result[i]=input.length;
           else
               result[i]=stack.peek();

           stack.push(i);
        }

        return result;
    }

    private static int[] previousSmallerElement(int[] input) {
        int[] result = new int[input.length];

        LinkedList<Integer> stack = new LinkedList<>();
        for (int i = 0; i < input.length; i++) {

            while (!stack.isEmpty() && input[stack.peek()]>=input[i])
                stack.pop();
            if(stack.isEmpty())
                result[i]=-1;
            else
                result[i]=stack.peek();

            stack.push(i);
        }
        return result;
    }

    private static int calculateMaxArea(int[] prevSmallerElm, int[] nextSmallerElm,int[] input) {

        int max=0;
        for (int i = 0; i <prevSmallerElm.length ; i++) {

           max=Math.max((nextSmallerElm[i]-prevSmallerElm[i]-1)*input[i],max);

        }

        return max;
    }



}
