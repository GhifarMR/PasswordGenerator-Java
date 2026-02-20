/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testing;

import java.util.Random;

/**
 *
 * @author macbookair
 */
public class Testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        new fPassword().setVisible(true);
        
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String number = "1234567890";
        String symbols = "~!@#$%^&*()_+`-=";
        
        String character = uppercase + lowercase + number + symbols;
        char[] characterArray = character.toCharArray();
        
        Random random = new Random();
        int randomNumber;
        int passwordLength = 15;
        
        System.out.print("Your Password : ");
        for(int i = 0; i < passwordLength; i++) {
            randomNumber = random.nextInt(0, 78);
            System.out.print(characterArray[randomNumber]);
        }
        System.out.println();
        
    }
    
}
