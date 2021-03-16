package com.arjun1194.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileUtils {



    public static InputStream getStreamFromFile(File file) {
        try{
            return new FileInputStream(file);
        } catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }
}
