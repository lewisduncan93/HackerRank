package Warmup;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/plus-minus/problem
 *
 */

public class PlusMinus {

    static void plusMinus(int[] arr) {
        int negative = 0;
        int positive = 0;
        int zero = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                positive++;
            }
            if(arr[i] < 0){
                negative++;
            }
            else if (arr[i] == 0) {
                zero++;
            }
        }
        double positiveDecimal = (double)positive / (double)arr.length;
        double negativeDecimal = (double)negative / (double)arr.length;
        double zeroDecimal = (double)zero / (double)arr.length;

        System.out.println(positiveDecimal);
        System.out.println(negativeDecimal);
        System.out.println(zeroDecimal);
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
