package com.tugas3;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame implements ActionListener {
    JLabel lTitle, lPanjang, lLebar, lTinggi, lHasil, lHasilLuas, lHasilKeliling, lHasilVolume, lHasilLuasPermukaan;
    final JTextField fPanjang, fLebar, fTinggi;
    JButton bHitung, bReset;




    public GUI(){
        lTitle = new JLabel("Kalkulator Kubus");

        lPanjang = new JLabel("Panjang");
        fPanjang = new JTextField(15);

        lLebar = new JLabel("Lebar");
        fLebar = new JTextField(15);

        lTinggi = new JLabel("Tinggi");
        fTinggi = new JTextField(15);

        lHasil = new JLabel("Hasil");
        lHasilLuas = new JLabel();
        lHasilKeliling = new JLabel();
        lHasilVolume = new JLabel();
        lHasilLuasPermukaan = new JLabel();

        bHitung = new JButton("Hitung");
        bReset = new JButton("Reset");
        setSize(500, 500);
        setTitle("Kalkulator");
        setLayout(null);

        bHitung.addActionListener(this);
        bReset.addActionListener(this);

        add(lTitle);
        add(lPanjang);
        add(fPanjang);
        add(lLebar);
        add(fLebar);
        add(lTinggi);
        add(fTinggi);
        add(lHasil);
        add(lHasilLuas);
        add(lHasilKeliling);
        add(lHasilVolume);
        add(lHasilLuasPermukaan);
        add(bHitung);
        add(bReset);

        lTitle.setBounds(200,10, 100, 20);
        lPanjang.setBounds(50, 60, 100, 20);
        fPanjang.setBounds(200, 60, 100, 20);
        lLebar.setBounds(50, 110, 100, 20);
        fLebar.setBounds(200, 110, 100, 20);
        lTinggi.setBounds(50, 160, 100, 20);
        fTinggi.setBounds(200, 160, 100, 20);
        lHasil.setBounds(50, 210, 100, 20);
        lHasilLuas.setBounds(50, 240, 200, 20);
        lHasilKeliling.setBounds(50, 270, 200, 20);
        lHasilVolume.setBounds(50, 300, 200, 20);
        lHasilLuasPermukaan.setBounds(50, 330, 200, 20);
        bHitung.setBounds(50, 390, 100, 30);
        bReset.setBounds(200, 390, 100, 30);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent e){
        try{
            int luas, keliling, volume, luaspermukaan;
            int panjang = Integer.parseInt(fPanjang.getText());
            int lebar = Integer.parseInt(fLebar.getText());
            int tinggi = Integer.parseInt(fTinggi.getText());

            if(e.getSource()==bHitung){
                luas = panjang * lebar;
                lHasilLuas.setText("Luas Persegi : " + luas);
                keliling = 2*panjang + 2*lebar;
                lHasilKeliling.setText("Keliling Persegi : " + keliling);
                volume = panjang * lebar * tinggi;
                lHasilVolume.setText("Volume Balok : " + volume);
                luaspermukaan = (2*panjang*lebar)+(2*panjang*tinggi)+(2*tinggi*lebar);
                lHasilLuasPermukaan.setText("Luas Permukaan Balok : " + luaspermukaan);

            } else if(e.getSource()==bReset){
                clearFields();
            }


        } catch (NumberFormatException numberFormatException) {
            JOptionPane.showMessageDialog(null, "Input Hanya Boleh Angka, dan Tidak Boleh Kosong");
        }

    }

    private void clearFields(){
        fPanjang.setText("");
        fLebar.setText("");
        fTinggi.setText("");
        lHasilLuas.setText("");
        lHasilLuasPermukaan.setText("");
        lHasilVolume.setText("");
        lHasilKeliling.setText("");
    }

}
