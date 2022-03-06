package com.tugas2;

public class Tabung extends Lingkaran implements MenghitungRuang {
    double tinggi, volume, luasPermukaan;

    public Tabung(double jari, double tinggi) {
        super(jari);
        this.tinggi = tinggi;
    }

    public Tabung(double jari) {
        super(jari);
    }

    @Override
    public double hitungVolume() {
        volume = 2*PI*Math.pow(this.jari, 2)*this.tinggi;
        return volume;
    }

    @Override
    public double hitungLuasPermukaan() {
        luasPermukaan = (2*PI*this.jari*this.tinggi)+(2*PI*Math.pow(this.jari, 2));
        return luasPermukaan;
    }
}
