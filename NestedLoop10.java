package com.mycompany.modulix;

import java.util.Scanner;

public class NestedLoop10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int pilihan;
        int jumlahData = 0;
        double totalUsia = 0;
        double totalKuadratUsia = 0;

        int usia20 = 0, usia40 = 0, usia60 = 0, usia80 = 0, usia100 = 0;

        do {
            System.out.println("\nMenu : ");
            System.out.println("1. Memasukkan data usia");
            System.out.println("2. Rata-rata");
            System.out.println("3. Deviasi standar");
            System.out.println("4. Diagram batang");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan usia (0-100) : ");
                    int usia = input.nextInt();
                    if (usia < 0 || usia > 100) {
                        System.out.println("Usia harus dalam rentang 0 sampai 100.");
                    } else {
                        jumlahData++;
                        totalUsia += usia;
                        totalKuadratUsia += usia * usia;

                        if (usia <= 20) {
                            usia20++;
                        } else if (usia <= 40) {
                            usia40++;
                        } else if (usia <= 60) {
                            usia60++;
                        } else if (usia <= 80) {
                            usia80++;
                        } else {
                            usia100++;
                        }
                    }
                    break;

                case 2:
                    if (jumlahData == 0) {
                        System.out.println("Belum ada data usia yang dimasukkan.");
                    } else {
                        double rataRata = totalUsia / jumlahData;
                        System.out.println("Rata-rata usia : "+rataRata);
                    }
                    break;

                case 3:
                    if (jumlahData == 0) {
                        System.out.println("Belum ada data usia yang dimasukkan.");
                    } else {
                        double rataRata = totalUsia / jumlahData;
                        double variansi = (totalKuadratUsia / jumlahData) - (rataRata * rataRata);
                        double deviasiStandar = Math.sqrt(variansi);
                        System.out.println("Deviasi standar usia : "+deviasiStandar);
                    }
                    break;

                case 4:
                    System.out.println("\nDiagram Batang:");
                    System.out.print("0 - 20\t\t: ");
                    for (int i = 0; i < usia20; i++) System.out.print("*");
                    System.out.println();
                    System.out.print("21 - 40\t\t: ");
                    for (int i = 0; i < usia40; i++) System.out.print("*");
                    System.out.println();
                    System.out.print("41 - 60\t\t: ");
                    for (int i = 0; i < usia60; i++) System.out.print("*");
                    System.out.println();
                    System.out.print("61 - 80\t\t: ");
                    for (int i = 0; i < usia80; i++) System.out.print("*");
                    System.out.println();
                    System.out.print("81 - 100\t: ");
                    for (int i = 0; i < usia100; i++) System.out.print("*");
                    System.out.println();
                    break;

                case 5:
                    System.out.println("Terima kasih! Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        } while (pilihan != 5);

        input.close();
    }
}