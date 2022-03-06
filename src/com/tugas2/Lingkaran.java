package com.tugas2;

public class Lingkaran implements MenghitungBidang {
    double jari, luas, keliling;

    public Lingkaran(double jari) {
        this.jari = jari;
    }

    @Override
    public double hitungLuas() {
        luas = PI*Math.pow(this.jari, 2);
        return luas;
    }

    @Override
    public double hitungKeliling() {
        keliling = 2*PI*this.jari;
        return keliling;
    }
}
