package Warmup;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 *
 */

public class TimeConversion {

    static String timeConversion(String s){
        String [] tempArray = s.split(":");
        String hours = tempArray[0];
        String minutes = tempArray[1];
        String seconds = tempArray[2].substring(0, 2);

        int tempHours;

        if (tempArray[2].substring(2, 4).equalsIgnoreCase("PM")) {
            if (Integer.parseInt(hours) < 12) {
                tempHours = Integer.parseInt(hours);
                tempHours += 12;
                hours = Integer.toString(tempHours);
            }
        }
        if (tempArray[2].substring(2, 4).equalsIgnoreCase("AM")) {
            if (Integer.parseInt(hours) == 12) {
                hours = "00";
            }
        }
        s = hours + ":" + minutes + ":" + seconds;
        return s;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}

