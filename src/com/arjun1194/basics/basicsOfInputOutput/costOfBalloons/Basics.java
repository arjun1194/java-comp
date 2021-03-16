package com.arjun1194.basics.basicsOfInputOutput.costOfBalloons;

import com.arjun1194.Utils.FileUtils;

import java.io.File;
import java.io.InputStream;
import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {

        File file = new File("src/com/company/basicsOfInputOutput/costOfBalloons/input.txt");
        InputStream in = FileUtils.getStreamFromFile(file);

        Scanner scn = new Scanner(in);
        int n = scn.nextInt();
        for(int i = 0; i< n ; i++){
            int totalPrice = 0;
            int totalAltPrice = 0;
             int purpleBalloonPrice = scn.nextInt();
             int greenBalloonPrice = scn.nextInt();
             int numberOfParticipants = scn.nextInt();
             for (int p = 1; p <= numberOfParticipants; p++){
                 int iPurple = scn.nextInt();
                 int iGreen = scn.nextInt();
                 int iPrice = purpleBalloonPrice*iPurple + greenBalloonPrice*iGreen;
                 int iAltPrice = greenBalloonPrice*iPurple + purpleBalloonPrice*iGreen;
                 totalPrice += iPrice;
                 totalAltPrice += iAltPrice;
            }
            if (totalPrice < totalAltPrice) System.out.println(totalPrice);
            else System.out.println(totalAltPrice);
        }

    }
}
