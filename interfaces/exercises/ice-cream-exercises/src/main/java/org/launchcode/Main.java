package org.launchcode;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        // testing code
//        for (Flavor f : flavors) {
//            System.out.println(f.getName());
//        }
//        System.out.println(" ");
//
//        for(Cone c : cones) {
//            System.out.println(c.getName() + ": $" + c.getCost());
//        }
        // testing code

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.
        Comparator fComparator = new FlavorComparator();
        flavors.sort(fComparator);
        for (Flavor f : flavors) {
            System.out.println(f.getName());
        }

        System.out.println(" ");


        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.
        Comparator cComparator = new ConeComparator();
        cones.sort(cComparator);
        for(Cone c : cones) {
            System.out.println(c.getName() + ": $" + c.getCost());
        }

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
    }
}