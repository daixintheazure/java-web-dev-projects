package org.launchcode;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String [] args) {
        int[] someArray = {1, 1, 2, 3, 5, 8};
        String someString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String someString2 = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";


        String[] stringArray = someString.split(" ");
        //System.out.println( Arrays.toString(stringArray));

        String[] stringArray2 = someString2.split("\\.");
        System.out.println( Arrays.toString(stringArray2));

        for (int i = 0; i < someArray.length; i++){
            if(i % 2 != 0) {
                System.out.print(someArray[i]);
            }
        }

       // System.out.println( Arrays.toString(stringArray));


    }
}
