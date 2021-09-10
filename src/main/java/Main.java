/*
 *  UCF COP3330 Fall 2021 Assignment 9 Solution
 *  Copyright 2021 Christine Hawkins
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double Gallon = 350;

        System.out.println("Enter length: ");
        double length = input.nextDouble();

        System.out.println("Enter width: ");
        double width = input.nextDouble();

        double Area = length * width;
        int paint = (int) Math.ceil(Area / Gallon);


        System.out.println("You will need to purchase "+paint+" gallons of paint to cover "+Area+" square feet");

    }
}