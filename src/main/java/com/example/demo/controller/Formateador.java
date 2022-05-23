package com.example.demo.controller;

public class Formateador {

    public static String formateador (String numero) {

        String numeroEnMinuscula = numero.toLowerCase();
        char[] arrayConverted = new char[numeroEnMinuscula.length()];

        for (int i = 0; i < numeroEnMinuscula.length(); i++) {
            arrayConverted[i] = numeroEnMinuscula.charAt(i);

            if (arrayConverted[i] == 'a' || arrayConverted[i] == 'b' || arrayConverted[i] == 'c') {
                arrayConverted[i] = '2';
            } else if (arrayConverted[i] == 'd' || arrayConverted[i] == 'e' || arrayConverted[i] == 'f') {
                arrayConverted[i] = '3';
            } else if (arrayConverted[i] == 'g' || arrayConverted[i] == 'h' || arrayConverted[i] == 'i') {
                arrayConverted[i] = '4';
            } else if (arrayConverted[i] == 'j' || arrayConverted[i] == 'k' || arrayConverted[i] == 'l') {
                arrayConverted[i] = '5';
            } else if (arrayConverted[i] == 'm' || arrayConverted[i] == 'n' || arrayConverted[i] == 'o') {
                arrayConverted[i] = '6';
            } else if (arrayConverted[i] == 'p' || arrayConverted[i] == 'q' || arrayConverted[i] == 'r' || arrayConverted[i] == 's') {
                arrayConverted[i] = '7';
            } else if (arrayConverted[i] == 't' || arrayConverted[i] == 'u' || arrayConverted[i] == 'v') {
                arrayConverted[i] = '8';
            } else if (arrayConverted[i] == 'w' || arrayConverted[i] == 'x' || arrayConverted[i] == 'y' || arrayConverted[i] == 'z') {
                arrayConverted[i] = '9';
            } else {
                arrayConverted[i] = numeroEnMinuscula.charAt(i);
            }
        }

        String result = String.valueOf(arrayConverted);


        if (result.length() == 10) {
            String resultA = result.substring(0, 2);
            String resultB = result.substring(2, 6);
            String resultC = result.substring(6, 10);
            result = "0" + resultA + " " + resultB + "-" + resultC;
        }

        if (result.length() == 8) {
            String resultA = result.substring(0, 4);
            String resultB = result.substring(4, 8);
            result = resultA + "-" + resultB;
        }

        return result;
    }

}
