import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 * https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem
 *
 */

public class Solution {

    static int[] breakingRecords(int[] scores){
        int highest = scores[0];
        int lowest = highest;
        int highestCount = 0;
        int lowestCount = 0;

        int[]listCount ={0, 0};

        for (int i = 0; i < scores.length; i++){
            if (scores[i] > highest){
                highest = scores[i];
                highestCount++;
            }
            if (scores[i] < lowest){
                lowest = scores[i];
                lowestCount++;
            }
        }
        listCount[0] = highestCount;
        listCount[1] = lowestCount;

        return listCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[n];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int[] result = breakingRecords(scores);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}