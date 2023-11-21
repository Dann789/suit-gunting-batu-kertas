/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamesuit;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
import java.util.Random;
public class GameSuit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        String[] suit = {"Gunting", "Batu", "Kertas"};
        
        char menu = 'y';
        do {
            System.out.print("Masukkan Pilihan Suitmu(Gunting/Batu/Kertas): ");
            String suitmu = input.next();
            input.nextLine();
            String suitcomp = suit[random.nextInt(suit.length)];
            
            System.out.println("Computer: " + suitcomp);
            System.out.println("Suitmu: " + suitmu);
            
            if(suitmu.equalsIgnoreCase("Gunting")) {
                switch(suitcomp) {
                    case "Batu":
                        System.out.println("Computer Win!");
                        break;
                    
                    case "Kertas":
                        System.out.println("You Win!");
                        break;
                        
                    case "Gunting":
                        System.out.println("Seri");
                        break;
                }  
            } else if(suitmu.equalsIgnoreCase("Batu")) {
                switch(suitcomp) {
                    case "Gunting":
                        System.out.println("You Win!");
                        break;
                    
                    case "Kertas":
                        System.out.println("Computer Win!");
                        break;
                        
                    case "Batu":
                        System.out.println("Seri");
                        break;
                }
            } else if(suitmu.equalsIgnoreCase("Kertas")) {
                switch(suitcomp) {
                    case "Batu":
                        System.out.println("You Win!");
                        break;
                    
                    case "Gunting":
                        System.out.println("Computer Win!");
                        break;
                        
                    case "Kertas":
                        System.out.println("Seri");
                        break;
                }
            } else {
                System.out.println("Masukkan Pilihan Yang Benar!!!");
            }
                        
            System.out.print("Apakah Anda Ingin Mengulang Permainan? ");
            menu = input.next().charAt(0);
        } while(menu == 'y'|| menu == 'Y');
    }
    
}
