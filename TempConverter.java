/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.adse2509.sess02_Variables_Datatypes_Operators;

import java.util.Scanner;

/**
 *Java program that accepts the temperature in Degrees Fahrenheit
 * and converts it to Degrees Celsius.
 * @author mooh
 */
public class TempConverter {
    
    // Class field to get input from the user
    static Scanner sc;
    // main method begins program execution Main => C#
    public static void main(String[] args)
    {
        // Method level variavles to be used in the program
        float fahrenheit, celsius;
        //instatiate the class variable for the user input
        sc = new Scanner(System.in);
        
        // Read in the radius from the user
        System.out.println("Please enter the temperature in Degrees Fahrenheit " + 
                "I'll calculate the temperature in Degrees Celsius");
        fahrenheit = sc.nextFloat();
        sc.close(); //close the input stream
        
        celsius = (float) (fahrenheit - 32) / (9.0f / 5.0f);
        
        //Display the circles dimensions
        System.out.println("Conversion Result");
        System.out.println("-".repeat(55));
        System.out.printf("%-15s : %7.1f ℉", "Fahrenheit", fahrenheit);
        System.out.printf("%n%-15s : %7.1f ℃ %n", "Celsius", celsius);
        System.out.println("-".repeat(55));
    }
    
}