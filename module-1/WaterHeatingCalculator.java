/*
* Program that calculates energy 
* needed to heat water from initial to final temperature.
* @author Mike Audam
*/

import java.util.Scanner; 



public class WaterHeatingCalculator {

    public static void main(String[] args) {
        
        // Creating a Scanner object
        Scanner scanner = new Scanner(System.in); 

        // --- Getting User Input ---
        System.out.println("--- Water Heating Energy Calculator ---");

        // Prompting User for water mass
        System.out.print("Enter the mass of water in kilograms (kg): ");
        double waterMass = scanner.nextDouble(); 

        // Prompting User for initial temperature
        System.out.print("Enter the initial temperature in Celsius (°C): ");
        double initialTemp = scanner.nextDouble(); 

        // Prompting User for final temperature
        System.out.print("Enter the final temperature in Celsius (°C): ");
        double finalTemp = scanner.nextDouble(); 

        // --- Calculation Q ---
        // Q = waterMass (finalTemperature – initialTemperature) * 4184 
        double energyNeeded = waterMass * (finalTemp - initialTemp) * 4184;

        // --- Output ---
        System.out.println("\n--- Calculation Result ---");
        System.out.println("Water Mass: " + waterMass + " kg");
        System.out.println("Initial Temp: " + initialTemp + " °C");
        System.out.println("Final Temp: " + finalTemp + " °C");
        System.out.println("Energy needed (Q): " + energyNeeded + " Joules (J)");

        scanner.close(); 
    }
}