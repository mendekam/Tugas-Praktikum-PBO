package com.tugas1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float celcius;
        int pilihanMenu;

        System.out.println("PROGRAM KONVERSI SUHU AIR");
        System.out.println("-------------------------");
        System.out.println("Silakan input suhu dalam celcius : ");
        Scanner input = new Scanner(System.in);
        celcius = input.nextFloat();

        Konversi konversi = new Konversi(celcius);

        do{
            System.out.println("\n");
            System.out.println("Pilihan Menu");
            System.out.println("------------");
            System.out.println("1. Lihat Data Konversi");
            System.out.println("2. Edit Data Konversi");
            System.out.println("3. Exit");
            System.out.println("Pilih : ");
            pilihanMenu = input.nextInt();

            switch (pilihanMenu){
                case 1:
                    System.out.println("\n");
                    System.out.println("Suhu dalam celcius : " + konversi.celcius + "°C");
                    System.out.println("Suhu dalam fahrenheit : " + konversi.ubahFahrenheit() + "°F");
                    System.out.println("Suhu dalam reamur : " + konversi.ubahReamur() + "°R");
                    System.out.println("Suhu dalam kelvin : " + konversi.ubahKelvin() + "K");
                    System.out.println("Kondisi Air " + konversi.kondisiAir());
                    break;

                case 2:
                    System.out.println("\n");
                    System.out.println("Silakan input suhu dalam celcius : ");
                    celcius = input.nextFloat();
                    konversi.celcius = celcius;
                    break;

                case 3:
                    System.out.println("\n");
                    System.out.println("Keluar...");
                    break;

                default:
                    System.out.println("\n");
                    System.out.println("Tidak ada menu...");
            }

        }while(pilihanMenu != 3);

        System.exit(0);
        //System.out.println(celcius);

    }
}
