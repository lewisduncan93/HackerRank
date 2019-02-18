package Warmup;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/mini-max-sum/problem
 *
 */

public class MiniMaxSum {

    static void miniMaxSum(int[] arr)
    {
        long maxVal = arr[0];
        long minVal = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            if(arr[i] > maxVal)
            {
                maxVal = arr[i];
            }
            if(arr[i] < minVal){
                minVal = arr[i];
            }
        }
        long minSum = 0, maxSum = 0;

        for(int i : arr)
        {
            maxSum += i;
            minSum += i;
        }

        maxSum = maxSum - maxVal;
        minSum = minSum - minVal;

        System.out.println(maxSum + " " + minSum);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
