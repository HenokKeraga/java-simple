package gfg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class UniquePath {

    public static void main(String[] args) {
        int row = 3;
        int column = 4;

        // System.out.println(getHowManyWay(row,column));

        int[][] input = new int[3][4];
        for (int i = 0; i < input.length; i++) {
            Arrays.fill(input[i], 1);
        }

        Arrays.fill(input[2], 3);

        System.out.println(maxProfit(row, column, input));

    }

    private static int maxProfit(int row, int column, int[][] input) {

        int[][] dp = new int[row][column];
        dp[0][0] = 1;

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < column; j++) {

                if (i > 0 && j > 0) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]) + input[i][j];
                } else if (i > 0) {
                    dp[i][j] = dp[i - 1][j] + input[i][j];
                } else if (j > 0) {
                    dp[i][j] = dp[i][j - 1] + input[i][j];
                }

            }

        }

        var arrayList = new ArrayList<Map<Integer, Integer>>();

        arrayList.add(Map.of(row - 1, column - 1));

        int i = row - 1;
        int j = column - 1;
//        while (i > 0 || j > 0) {
//
//            if (i > 0 && dp[i - 1][j] > 0) {
//                arrayList.add(Map.of(i - 1, j));
//                i--;
//
//            } else {
//                arrayList.add(Map.of(i, j - 1));
//                j--;
//            }
//
//
//        }

        while (i >= 0 && j >= 0) {

            if (i == 0 && j == 0) {
                break;
            } else if (i == 0) {
                arrayList.add(Map.of(i, j - 1));
                j--;
            } else if (j == 0) {
                arrayList.add(Map.of(i - 1, j));
                i--;
            } else {
                if (dp[i - 1][j] > dp[i][j - 1]) {
                    arrayList.add(Map.of(i - 1, j));
                    i--;
                }else {
                    arrayList.add(Map.of(i,j-1));
                    j--;
                }

            }

        }

        System.out.println(arrayList);


        return dp[row - 1][column - 1];
    }

    private static int getHowManyWay(int row, int column) {
        int[][] dp = new int[row][column];

        dp[0][0] = 1;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (i > 0 && j > 0) {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                } else if (i > 0) {
                    dp[i][j] = dp[i - 1][j];
                } else if (j > 0) {
                    dp[i][j] = dp[i][j - 1];
                }
            }

        }

        return dp[row - 1][column - 1];

    }


}
