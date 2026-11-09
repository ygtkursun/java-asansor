package com.mycompany.java.asansor;

import java.util.Scanner;

public class JavaAsansor {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Bulundugunuz kati (1-10) girin: ");
        int number = input.nextInt();
        
        System.out.print("Hedef kati (1-10) girin: ");
        int number2 = input.nextInt();
        
        if (number <= 10 && number >= 1 && number2 <= 10 && number2 >= 1) {
            
            if (number2 > number) {
                
                System.out.println("Mevcut kat: " + number);
                
                System.out.println("Hedef kat: " + number2);
                
                System.out.println("Asansor yukari cikiyor.");
                
                System.out.println("Cikacaginiz kat: " + (number2 - number));
                
            }
            
            else if (number2 == number) {
                
                System.out.println("Mevcut kat: " + number);
                
                System.out.println("Hedef kat: " + number2);
                
                System.out.println("Asansor hareket etmiyor.");
                
                System.out.println("Hareket yok.");
                
            }
            
            else {
              
                System.out.println("Mevcut kat: " + number);
                
                System.out.println("Hedef kat: " + number2);
              
                System.out.println("Asansor asagi iniyor.");
                
                System.out.println("Ineceginiz kat: " + (number - number2));  
                
            }
            
        }
        
        else {
            
            System.out.print("Girdiginiz bilgilerde yanlislik var!");
            
        }
        
        input.close();
        
    }
}