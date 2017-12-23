/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelcost;
// import statement is used to include libraries written by someone else.
// the Scanner class is used to read and write from the console.
import java.util.Scanner;

/**
 *
 * @author Peggy Fisher
 * @editor jlilly
 */
// every Java cost starts with a class name using CamelCase
public class TravelCost {

    /**
     * @param args the command line arguments
     */
    // every Java project must have one and only one main method
    public static void main(String[] args) {
        // TODO code application logic here
        // we will prompt the used for values to these variables, then use these values to make caluclations
        double distance;
        double mpg;
        double pricePerGallon;
        double totalCost;
        //double distance, mpg, pricerPerGallen, totalCost;
        // This lets us read whatever is inputted by the keyboard
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the total distance in miles: ");
        distance = in.nextDouble();
        System.out.println("Enter the mpg for the vehicle: ");
        mpg = in.nextDouble();
        System.out.println("Enter the price of one gallon of gas: ");
        pricePerGallon = in.nextDouble();
        
        // perform the calculation with basic algebra
        totalCost = (distance/mpg)*pricePerGallon;
        System.out.printf("The trip is going to cost $%5.2f", totalCost);
        System.out.println();
        
        // build, run
        
        /* note:
        * curly brackets indicate blocks of code
        */
    }
}
