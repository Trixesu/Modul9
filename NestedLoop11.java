package com.mycompany.modulix;

import java.util.Scanner;

public class NestedLoop11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai n (tinggi segitiga Pascal) : ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            for (int r = 0; r <= n - i; r++) {
                System.out.print("  ");
            }
            int kombinasi = 1;
            for (int r = 0; r <= i; r++) {
                System.out.printf("%4d", kombinasi);

                kombinasi = kombinasi * (i - r) / (r + 1);
            }
            System.out.println();
        }
        input.close();
    }
}
