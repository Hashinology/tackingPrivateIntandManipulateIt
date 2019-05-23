package com.Hashinology.Java.utilities;

import java.util.MissingFormatArgumentException;

public class MathHelper {
    private int total;

    //creating Cunstructor to Instanitate Object
    // you can initilize the total varible to start with 50 instead of default zero
    public MathHelper() {
        System.out.println("Constructor Created");
        total = 50;
    }

    public MathHelper(int total) {
        this.total = total;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {

        this.total = total;
    }

    public int addNumber(String prompt) throws MissingFormatArgumentException {
        String input = InputHelper.getInput(prompt);
        int value = Integer.parseInt(input);

        total += value;

        return value;
    }
}
