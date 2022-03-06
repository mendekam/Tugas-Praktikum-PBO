package com.tugas2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int pilihanMenu;
        double jari, panjang, lebar, tinggi;

        Scanner input = new Scanner(System.in);

        do {

            System.out.println("MENU UTAMA");
            System.out.println("1. Hitung Balok\n2. Hitung Tabung\n0. Keluar\nPilihan :");
            pilihanMenu = input.nextInt();

            switch (pilihanMenu){
                case 0:
                    System.out.println("Keluar...");
                    System.exit(0);
                    break;

                case 1:
                    System.out.println("Input Panjang : ");
                    panjang = input.nextDouble();

                    System.out.println("Input Lebar");
                    lebar = input.nextDouble();

                    System.out.println("Input Tinggi : ");
                    tinggi = input.nextDouble();

                    Balok balok = new Balok(panjang, lebar, tinggi);

                    System.out.println("Luas Persegi Panjang : " + balok.hitungLuas());
                    System.out.println("Keliling Persegi Panjang : " + balok.hitungKeliling());
                    System.out.println("Volume Balok : " + balok.hitungVolume());
                    System.out.println("Luas Permukaan Balok : " + balok.hitungLuasPermukaan());

                    System.out.println("Ulangi? [Yes = 1/No = 0] : ");
                    pilihanMenu = input.nextInt();
                    break;

                case 2:
                    System.out.println("Input Jari-Jari : ");
                    jari = input.nextDouble();

                    System.out.println("Input Tinggi : ");
                    tinggi = input.nextDouble();

                    Tabung tabung = new Tabung(jari, tinggi);

                    System.out.println("Luas Lingkaran : " + tabung.hitungLuas());
                    System.out.println("Keliling Lingkaran : " + tabung.hitungKeliling());
                    System.out.println("Volume Balok : " + tabung.hitungVolume());
                    System.out.println("Luas Permukaan Balok : " + tabung.hitungLuasPermukaan());

                    System.out.println("Ulangi? [Yes = 1/No = 0] : ");
                    pilihanMenu = input.nextInt();
                    break;

                default:
                    System.out.println("\n");
                    System.out.println("Tidak ada menu...");
            }

        }while (pilihanMenu != 0);

    }
}
