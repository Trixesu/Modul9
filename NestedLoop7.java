package com.mycompany.modulix;

import java.util.Scanner;

public class NestedLoop7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan ukuran matriks identitas : ");
        int n = input.nextInt();
        
        System.out.println("Matriks identitas "+n+" x "+n+" : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                if (i == j) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            System.out.println();
        }
        input.close();
    }
}