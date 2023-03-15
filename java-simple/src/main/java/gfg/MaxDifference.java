package gfg;

public class MaxDifference {

    public static void main(String[] args) {

        int arr[] = {1, 2, 90, 10, 110};
        System.out.println("Maximum difference is " + maxDiff(arr, 5));
    }

    private static int maxDiff(int[] arr, int i) {

        int min=arr[0];
        int maxD=0;

        for (int j = 1; j < arr.length; j++) {
          maxD=Math.max(maxD,arr[j]-min);
          if(arr[j]<min){
              min=arr[j];
          }
        }

        return maxD;

    }
}
