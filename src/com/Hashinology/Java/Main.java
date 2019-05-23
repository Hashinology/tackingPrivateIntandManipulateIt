package com.Hashinology.Java;


import com.Hashinology.Java.utilities.MathHelper;

import java.util.MissingFormatArgumentException;

public class Main {

    public static void main(String[] args) {
        // Defualt Constructor the IDE built for you automatically
        //MathHelper math = new MathHelper();

        /*
        created Constructor that receive the initial value of the total
         we created the contructor in MathHelper and passed int Total variable
         now it will take the seconstructor in MathHelper Class
         */

        MathHelper mhelper = new MathHelper(40);

        try {
            while (true) {
                int input = mhelper.addNumber("Enter Numbers only");
                int total = mhelper.getTotal();

                String msg = String.format(" number enetered: %d and total of: %d",
                        input, total);
                System.out.println(msg);
                total += total;
                System.out.println(total);
            }
        } catch (NumberFormatException e) {
            //e.printStackTrace();
            System.out.println("All Done! ");
        }

    }
}

        // using public Static Access Modifier Direct Access
        /*
        String input = InputHelper.getInput("Enter a value here: ");
        System.out.println("you Entered: "+input);

        input = InputHelper.getInput("Enter a value here: ");
        System.out.println("you Entered: "+input);
        */

        /*
        // using non Static Access Modifier or instance Method
        InputHelper helper = new InputHelper();
        String input = helper.getInput("Enter a value here: ");
        System.out.println("you Entered: "+input);

        input = helper.getInput("Enter a value here: ");
        System.out.println("you Entered: "+input);
        */
