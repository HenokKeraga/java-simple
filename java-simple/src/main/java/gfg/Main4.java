package gfg;

import java.util.ArrayList;

public class Main4 {
   // Function to find a continuous sub-array which adds up to a given number
    public static void main(String[] args) {

      //  int[] input = new int[]{135, 101, 170, 125,79,159,163,65,106,146,82,28,162,92,196,143,28,37,192,5,103,154,93,183,22,117,119,96,48,127,172,139,70,113,68,100,36,95,104,12,123,134};
        int[] input = new int[]{1 ,2 ,3, 4};

        System.out.println(subarraySum(input,4,0));

    }


    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        // Your code here
        int sum=0;
        int start=0;
        int i=0;

        // for(i=1;i<=n;i++){

        //     while(sum>s && start<i-1){
        //         sum=sum-arr[start];
        //         start++;
        //     }
        //     if(sum==s){
        //         break;
        //     }
        //     if(i<n){
        //         sum=sum+arr[i];
        //     }
        // }

        while(sum<s&&i<n){
            sum=sum+arr[i];
            i++;
        }
        if(sum>s){
            while(i<n ){
                while(sum>s && start<i-1){
                    sum=sum-arr[start];
                    start++;
                }
                if(sum==s){
                    break;
                }

                sum=sum+arr[i];
                i++;
            }
        }
        while(sum>s && start<i-1){
            sum=sum-arr[start];
            start++;
        }




        ArrayList<Integer> result = new ArrayList<>();
        if(sum!=s){
            result.add(-1);


        }else{
            result.add(start+1);
            result.add(i);

        }

        return result;
    }
}
