package org.launchcode;


import java.util.ArrayList;

public class ArrayListPractice {

    public static void main (String [] args){
       ArrayList<Integer> someArr = new ArrayList<>();
       someArr.add(1);
       someArr.add(2);
       someArr.add(3);
       someArr.add(4);
       someArr.add(5);
       someArr.add(6);
       someArr.add(7);
       someArr.add(8);
       someArr.add(9);
       someArr.add(10);

        System.out.println(sumEven(someArr));
    }

    public static int sumEven(ArrayList<Integer> someArr) {
        int total = 0;
        for (int integer : someArr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }
}
