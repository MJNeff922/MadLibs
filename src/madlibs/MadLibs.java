/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package madlibs;

/**
 *
 * @author MJNeff18579
 */
import java.util.Scanner;

public class MadLibs {

    public static void main(String[] args) {
        Scanner txtrdr = new Scanner(System.in);
        Scanner numrdr = new Scanner(System.in);
        
        System.out.println("Write a verb");
        
        String verb1 = txtrdr.nextLine();
        System.out.println("Write an integer");
        int int1 = numrdr.nextInt();
        
        System.out.println("Write a person's name");
        String name1 = txtrdr.nextLine();
        
        System.out.println("Write an adverb");
        String adverb1 = txtrdr.nextLine();
        
        System.out.println("Write an animal");
        String animal1 = txtrdr.nextLine();
        
        System.out.println("Write a past tense verb");
        String pastverb1 = txtrdr.nextLine();
        
        System.out.println("Write a decimal");
        double decimal1 = numrdr.nextDouble();
        
        System.out.println("Write an adjective");
        String adjective1 = txtrdr.nextLine();
        
        System.out.println("Write another integer");
        int int2 = numrdr.nextInt();
        
        System.out.println("Write a noun");
        String noun1 = txtrdr.nextLine();
        
        System.out.println("test3");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
    
}
