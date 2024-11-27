package com.mycompany.modulix;

public class NestedLoop9 {
    public static void main(String[] args) {       
        System.out.print("Detik : ");
        for (int detik = 1; detik <= 60; detik++) {
            System.out.print(detik+" ");
        }
        System.out.println();
        
        for (int menit = 1; menit <= 60; menit++) {
                System.out.println("Menit : "+menit);
                System.out.print("Detik : ");
                
            for (int detik = 1; detik <= 60; detik++) {
                System.out.print(detik+" ");  
            }
            System.out.println();
        }

        for (int jam = 1; jam <= 12; jam++) {
            System.out.println("Jam   : "+jam);
            
            for (int menit = 1; menit <= 60; menit++) {
                System.out.println("Menit : "+menit);
                System.out.print("Detik : ");
                
                for (int detik = 1; detik <= 60; detik++) {
                    System.out.print(detik+" ");  
                }
                System.out.println();
            }
        }
    }
}