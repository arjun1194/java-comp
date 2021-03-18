package com.arjun1194.basics.basicsOfInputOutput.seatingArrangement;

import com.arjun1194.Utils.FileUtils;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        File file = new File("src/com/arjun1194/basics/basicsOfInputOutput/seatingArrangement/input.txt");
        InputStream in = FileUtils.getStreamFromFile(file);

        BufferedReader br =
                new BufferedReader(new InputStreamReader(in));
        String n = br.readLine();

        int numberOfTests = Integer.parseInt(n);
        for (int i = 0; i < numberOfTests; i++) {
            int seatNo = Integer.parseInt(br.readLine());
            int seatFacing = seatFacing(seatNo);
            String seatType = seatType(seatNo);

            System.out.println(seatFacing+" "+seatType);
        }

    }

    static String seatType(int seatNo) {
        int rowNumber = (seatNo-1) / 6;
        int s = (rowNumber%2==0) ? (seatNo - 1) % 6:  5 - (seatNo - 1) % 6;
        //System.out.println("s = " + s+ " seat_number = " +seatNo );
        if (s == 0 || s == 5) return "WS";
        if (s == 1 || s == 4) return "MS";
        if (s == 2 || s == 3) return "AS";
        else return "Error";
    }


    static int seatFacing(int seatNo) {
        int rowNumber = (seatNo - 1) / 6;
        int columnNumber = (rowNumber%2==0) ? (seatNo - 1) % 6:  6 - (seatNo - 1) % 6;
        return rowNumber % 2 == 0?
                seatNo + 11 - 2 * columnNumber:
                seatNo + 2 * columnNumber - 13;
    }

}
