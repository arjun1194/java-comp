package com.arjun1194.basics;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        File file = new File("src/com/company/input.txt");
        InputStream in = getStreamFromFile(file);
        Scanner scn = new Scanner(in);
        while (scn.hasNext()) {
            String input = scn.next();
            System.out.println("You wrote ->" + input);
        }


    }

    static InputStream getStreamFromFile(File file) {
        try{
            return new FileInputStream(file);
        } catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }

}
