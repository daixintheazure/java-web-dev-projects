package org.launchcode;
import java.util.Scanner;
public class Area {
    public static void main(String[] args){
        double radius;
        double area;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter a Number");

        radius = input.nextDouble();
        input.close();

        area = Circle.getArea(radius);
        System.out.println(area);
    }
}
