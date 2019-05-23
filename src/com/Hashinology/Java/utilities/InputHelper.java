package com.Hashinology.Java.utilities;

import java.util.Scanner;

public class InputHelper {
    public static String getInput(String prompt){
        System.out.println(prompt);
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
}
