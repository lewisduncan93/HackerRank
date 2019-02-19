package Warmup;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/staircase/problem
 *
 */

public class Staircase {

    static void staircase(int n) {
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= n-i-2; j++){
                System.out.print(" ");
            }
            for(int j = n-i-1; j < n; j++){
                System.out.print("#");
            }
            System.out.println();
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}