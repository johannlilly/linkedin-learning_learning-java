package travelcost;
import java.util.Scanner;

/**
 *
 * @author Peggy Fisher
 * @editor jlilly
 * 
 * @notes
 * Understanding Data Types
 * Java is known as a strict data typing language. That means that every variable that we define must be declared with a data type. And you can not change the type of data stored in that variable.
 * 
 * Primitive Data Types
 * Characters
 *      char LetterA = 'a';
 * Boolean
 *      boolean result = true;
 * Integers (no fractional part)
 *      byte // signed values from -127 to +127, unsigned values fro 0 to 255
 *      short // 
 *      int
 *      long
 * Rational Numbers (may have a fractional part)
 *      float
 *      double
 */
public class TravelCost {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double distance;
        double mpg;
        double pricePerGallon;
        double totalCost;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the total distance in miles: ");
        distance = in.nextDouble();
        System.out.println("Enter the mpg for the vehicle: ");
        mpg = in.nextDouble();
        System.out.println("Enter the price of one gallon of gas: ");
        pricePerGallon = in.nextDouble();
        
        totalCost = (distance/mpg)*pricePerGallon;
        System.out.printf("The trip is going to cost $%5.2f", totalCost);
        System.out.println();
        
        // build, run
        
    }
}