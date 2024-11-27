package com.mycompany.modulix;

import java.util.Scanner;

public class NestedLoop8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int usia20 = 0;
        int usia40 = 0;
        int usia60 = 0;
        int usia80 = 0;
        int usia100 = 0;
        
        System.out.print("Masukkan jumlah penduduk : ");
        int jumPenduduk = input.nextInt();
        System.out.println("Usia harus dalam rentang 0 sampai 100.");
        
        for (int i = 1; i <= jumPenduduk; i++) {
            System.out.print("Usia warga "+i+" : ");
            int usia = input.nextInt();
            
            if (usia >= 0 && usia <= 20) {
                usia20++;
            } else if (usia >= 21 && usia <= 40) {
                usia40++;
            } else if (usia >= 41 && usia <= 60) {
                usia60++;
            } else if (usia >= 61 && usia <= 80) {
                usia80++;
            } else if (usia >= 81 && usia <= 100) {
                usia100++;
            }
        }
            System.out.println("Distribusi usia "+jumPenduduk+" penduduk diatas adalah : ");
            System.out.print("0 - 20\t\t: ");
            for (int i = 0; i < usia20; i++) System.out.print("*");
            System.out.println();
            System.out.print("20 - 40\t\t: ");
            for (int i = 0; i < usia40; i++) System.out.print("*");
            System.out.println();
            System.out.print("40 - 60\t\t: ");
            for (int i = 0; i < usia60; i++) System.out.print("*");
            System.out.println();
            System.out.print("60 - 80\t\t: ");
            for (int i = 0; i < usia80; i++) System.out.print("*");
            System.out.println();
            System.out.print("80 - 100\t: ");
            for (int i = 0; i < usia100; i++) System.out.print("*");
            System.out.println();
            
            input.close();
    }
}
