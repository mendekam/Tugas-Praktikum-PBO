package com.tugas4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame implements ActionListener {
    JLabel lTitle, lLogUsername, lRegUsername, lLogPass, lRegPass;
    final JTextField fLogUsername, fRegUsername;
    JPasswordField fLogPass, fRegPass;
    JButton bLogin, bRegister;

    public GUI(){
        lTitle = new JLabel("Tugas 4");

        lLogUsername = new JLabel("Username : ");
        fLogUsername = new JTextField(15);

        lRegUsername = new JLabel("Username : ");
        fRegUsername = new JTextField(15);

        lLogPass = new JLabel("Password : ");
        fLogPass = new JPasswordField(15);

        lRegPass = new JLabel("Password : ");
        fRegPass = new JPasswordField(15);

        bLogin = new JButton("Login");
        bRegister = new JButton("Register");

        setSize(450, 250);
        setTitle("Login/Register");
        setLayout(null);

        bLogin.addActionListener(this);
        bRegister.addActionListener(this);

        add(lTitle);
        add(lLogUsername);
        add(lRegUsername);
        add(lLogPass);
        add(lRegPass);
        add(fLogUsername);
        add(fRegUsername);
        add(fLogPass);
        add(fRegPass);
        add(bLogin);
        add(bRegister);

        lTitle.setBounds(200,10,80,20);
        lLogUsername.setBounds(10, 40, 100,30);
        fLogUsername.setBounds(80,40,100,30);
        lLogPass.setBounds(10,80,100,30);
        fLogPass.setBounds(80,80,100,30);
        bLogin.setBounds(80,120,90,20);
        lRegUsername.setBounds(250,40,100,30);
        fRegUsername.setBounds(320,40,100,30);
        lRegPass.setBounds(250,80,100,30);
        fRegPass.setBounds(320,80,100,30);
        bRegister.setBounds(320,120,90,20);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==bLogin){
            Connector connector = new Connector();
            String user = fLogUsername.getText();
            if (connector.checkUsername(user) && !user.equals("") && connector.checkLogin(user, String.valueOf(fLogPass.getPassword()))) {
                JOptionPane.showMessageDialog(null, "Login Success");
            }
            else if (user.isEmpty() || String.valueOf(fLogPass.getPassword()).isEmpty()) {
                JOptionPane.showMessageDialog(null, "Empty Input");
            }
            else if (!connector.checkUsername(user)) {
                JOptionPane.showMessageDialog(null, "Wrong Username");
            }
            else{
                JOptionPane.showMessageDialog(null,"Wrong Password");
            }
        }else if (e.getSource()==bRegister){
            Connector connector = new Connector();
            String regUsername = fRegUsername.getText();
            String regPass = String.valueOf(fRegPass.getPassword());
            if (!regUsername.isEmpty() && !regPass.isEmpty()) {
                connector.inputData(regUsername,regPass);
            }
            else {
                JOptionPane.showMessageDialog(null, "Empty Input");
            }
        }



    }
}
