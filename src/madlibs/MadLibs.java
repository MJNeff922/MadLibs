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
        Scanner kboard = new Scanner(System.in);
        
        System.out.println("Write a verb");
        
        String verb1 = kboard.nextLine();
        System.out.println("Write an integer");
        int int1 = kboard.nextInt();
        
        System.out.println("Write a person's name");
        String name1 = kboard.nextLine();
        
        System.out.println("Write an adverb");
        String adverb1 = kboard.nextLine();
        
        System.out.println("Write an animal");
        String animal1 = kboard.nextLine();
        
        System.out.println("Write a past tense verb");
        String pastverb1 = kboard.nextLine();
        
        System.out.println("Write a decimal");
        double decimal1 = kboard.nextDouble();
        
        System.out.println("Write an adjective");
        String adjective1 = kboard.nextLine();
        
        System.out.println("Write another integer");
        int int2 = kboard.nextInt();
        
        System.out.println("Write a noun");
        String noun1 = kboard.nextLine();
        
        System.out.println("test3");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
    
}
