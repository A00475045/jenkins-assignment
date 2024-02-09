package com.smu.mscda;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.text.WordUtils;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

//        String inputString = "hello world";
        Scanner scanner = new Scanner(System.in);
        System.out.println("This program will capitalize the input string and Generate MD5 hex");
        System.out.println("Ranjit Parshuram Pandey (A00475045)");
        System.out.println("");
        System.out.println("Enter the input string :");
        String inputString = scanner.nextLine();
        System.out.println("");

        System.out.println("Capitalized string is :" + convertStringToCapital(inputString));
        System.out.println("");
        System.out.println("MD5 hex is :" + generateMD5HEX(inputString));
    }
    public static String convertStringToCapital(String stringTobeCased) {
        return WordUtils.capitalize(stringTobeCased);
    }

    public static String generateMD5HEX(String inputString) {
        return DigestUtils.md5Hex(inputString);
    }
}

