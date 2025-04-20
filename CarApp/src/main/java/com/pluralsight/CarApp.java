package com.pluralsight;

import java.util.Scanner;

public class CarApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // 1. Ask for make, model, year
        System.out.print("Enter car make: ");
        String make = input.nextLine();

        System.out.print("Enter car model: ");
        String model = input.nextLine();

        System.out.print("Enter car year: ");
        int year = input.nextInt();

        Car myCar = new Car(make, model, year);

        // Step 3: Ask for distance to drive
        System.out.print("How many miles would you like to drive? ");
        double distance = input.nextDouble();

        // Step 4: Drive the car
        myCar.drive(distance);

        // Step 5: Ask for amount to refuel
        System.out.print("How many gallons would you like to add? ");
        double fuelAmount = input.nextDouble();

        // Step 6: Refuel the car
        myCar.refuel(fuelAmount);

        // Step 7: Print final car info
        System.out.println("\nFinal car status:");
        System.out.println(myCar);
    }
}
