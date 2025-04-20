package com.pluralsight;

public class Car {

    // Introducing the variables in this class as private
    private String make;
    private String model;
    private int year;
    private double fuelLevel;

    // Made a constructor without any parameters and defaulted the fuel to 50
    public Car() {
        this.make = "";
        this.model = "";
        this.year = 0;
        this.fuelLevel = 15.0;
    }
    // Made a constructor with a parameter and defaulted the fuel to 50
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelLevel = 15.0;
    }
    public void refuel(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid fuel amount. ");
            return;
        }
        fuelLevel += amount;

        if (fuelLevel > 18) {  // Capping the fuel level to 18
            fuelLevel = 18;
        }
        System.out.println("Car refueled. Current fuel: " + fuelLevel + " gallons.");
    }
    public void drive(double distance) {

        double gallonsNeeded = distance / 25.0;

            if (gallonsNeeded < fuelLevel) {
                fuelLevel -= gallonsNeeded;
                System.out.println("You drove " + distance + " miles and still have "
                        + fuelLevel + " gallons of fuel left.");
            } else if (gallonsNeeded == fuelLevel) {
                fuelLevel -= gallonsNeeded;
                System.out.println("You drove " + distance + " miles and used up your fuel perfectly!");
            } else {
                System.out.println("That is too far for you to go!");
            }
        }
    public String toString() {
        return year + " " + make + " " + model + " — Fuel: " + fuelLevel + " gallons";
    }
}
