package com.tugas2;

public class PersegiPanjang implements MenghitungBidang {
    double panjang, lebar, luas, keliling;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double hitungLuas() {
        luas = this.panjang*this.lebar;
        return luas;
    }

    @Override
    public double hitungKeliling() {
        keliling = 2*(this.panjang+this.lebar);
        return keliling;
    }
}
