package com.company;

import java.io.*;
import java.net.URL;

public class Primer1 {

    public static void readAllByByte(InputStream in, Object args) throws IOException {
	while (true) {
        int oneByte = in.read();
        if (oneByte != -1){
            System.out.println((char)oneByte);
        } else{
            System.out.println("\n"+"end");
            break;
        }
    }
    public static void main(String[] args) throw IOException{
    try {
        InputStream inFile = new FileInputStream("C:/tmp/text.txt");
        readAllByByte(inFile, args);
        System.out.println("\n\n\n");
        inFile.close();

        InputStream inUrl = new URL("http://google.com").openStream();
        readAllByByte(inUrl, args);
        System.out.println("\n\n\n");
        inUrl.close();

        InputStream inArray = new ByteArrayInputStream(new byte [] {7,9,3,7,4});
        readAllByByte(inArray, args);
        System.out.println("\n\n\n");
        inArray.close();

    }catch (IOException e) {
        System.out.println("Ошибка: "+e);
    }
        }
    }
}

