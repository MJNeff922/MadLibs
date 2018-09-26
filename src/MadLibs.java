/**
 *
 * @author MJNeff18579
 */

import java.util.Scanner;

public class MadLibs {

    public static void main(String[] args) {
        Scanner txtrdr = new Scanner(System.in);
        Scanner numrdr = new Scanner(System.in);
        
        //Collect answers
        
        System.out.print("Please enter an adjective: ");
        String adj1 = txtrdr.nextLine();
        
        System.out.print("Please enter an adjective: ");
        String adj2 = txtrdr.nextLine();
        
        System.out.print("Please enter an adjective: ");
        String adj3 = txtrdr.nextLine();
        
        System.out.print("Please enter an adjective: ");
        String adj4 = txtrdr.nextLine();
        
        System.out.print("Please enter an adjective: ");
        String adj5 = txtrdr.nextLine();
        
        System.out.print("Please enter an adverb: ");
        String adv = txtrdr.nextLine();
        
        System.out.print("Please enter an animal: ");
        String animal = txtrdr.nextLine();
        
        System.out.print("Please enter a noun: ");
        String noun = txtrdr.nextLine();
        
        System.out.print("Please enter an integer: ");
        int number = numrdr.nextInt();
        
        System.out.print("Please enter a body part: ");
        String part1 = txtrdr.nextLine();
        
        System.out.print("Please enter a body part: ");
        String part2 = txtrdr.nextLine();
        
        System.out.print("Please enter a body part: ");
        String part3 = txtrdr.nextLine();
        
        System.out.print("Please enter a plural noun: ");
        String pnoun1 = txtrdr.nextLine();
        
        System.out.print("Please enter a plural noun: ");
        String pnoun2 = txtrdr.nextLine();
        
        System.out.print("Please enter something you can eat: ");
        String food = txtrdr.nextLine();
        
        System.out.print("Please enter a verb: ");
        String verb = txtrdr.nextLine();
        
        System.out.print("Please enter a decimal: ");
        double decimal = numrdr.nextDouble();
        
        //Mad Libs print out
                
        System.out.println("Although we believe ourselves to be " + adv + " civilized, most");
        System.out.println("of us are really " + pnoun1 + " at heart, because we still believe in");
        System.out.println("" + adj1 + " superstitions that began while humans still lived in");
        System.out.println("" + pnoun2 + ". Some of these superstitions are:");
        System.out.println("");
        System.out.println("1. If you spill " + decimal + " pounds of salt, throw some over your left " + part1 + " for " + adj2 + " luck.");
        System.out.println("2. If a black " + animal + " runs in front of you, you are in " + adj3 + " trouble.");
        System.out.println("3. If you break a " + noun + ", you will have " + number + " years of " + adj4 + " luck.");
        System.out.println("4. Never " + verb + " under a ladder.");
        System.out.println("5. If your " + part2 + " itches, it means you will have an " + adj5 + " visitor.");
        System.out.println("6. If you want to keep vampires away from you, always wear");
        System.out.println("   " + food + " on a string around your " + part3 + ".");
    }
    
}
