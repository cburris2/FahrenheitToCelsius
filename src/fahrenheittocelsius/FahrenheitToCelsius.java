/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fahrenheittocelsius;

/**
 *
 * @author office
 */
import java.util.Scanner;
import javax.swing.JOptionPane;

public class FahrenheitToCelsius {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Create a scanner for user input
        /*Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a temperature:");
        
        double fah = input.nextDouble();
        
        // Convert Fahrenheit to Celsius
        
        double cel = (5.0 / 9) * (fah - 32);
        System.out.println("Fahrenheit " + fah + "degrees is "+cel +"in Celsius.");
        */
        // Simple Compute Change
        /*System.out.println("How much is your bill?");
        double bill = input.nextDouble();
        System.out.println("You hand the cashier:");
        double paywith = input.nextDouble();
        double change = bill - paywith;    
        System.out.println("Your change is $"+(-change));
        */
        // Using a GUI
        // Testing Git Functionality in Netbeans.
        String temp = JOptionPane.showInputDialog(null, "Enter a temperature in F", 
                "Farenheit to Celsius Calculator", JOptionPane.QUESTION_MESSAGE);
        
        double fahrenheit = Double.parseDouble(temp);
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        double celsiusDigits = (Math.round(celsius*100.0)/100.0);
        
        JOptionPane.showMessageDialog(null, fahrenheit + "F and is "+ 
                 celsiusDigits +" C",
                "Fahrenheit to Celsius Calculator" , JOptionPane.PLAIN_MESSAGE);
        
        // Now using console input
       /* Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a temperature:");
        
        double fah = input.nextDouble();
        
        // Convert Fahrenheit to Celsius
        
        double cel = (5.0 / 9) * (fah - 32);
        System.out.println(" " + fah + "F is "
                +(Math.round(cel*100.0)/100.0) +"C ");*/
    }
    
}
