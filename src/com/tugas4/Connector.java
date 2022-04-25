package com.tugas4;

import javax.swing.*;
import java.sql.*;

public class Connector {
    String DBurl = "jdbc:mysql://localhost:3306/tugasjdbc";
    String DBusername = "root";
    String DBpassword = "";

    String[] data = new String[5];
    Connection koneksi;
    Statement statement;

    public Connector() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection(DBurl,DBusername,DBpassword);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    void inputData (String username, String password){
        try {
            if (!checkUsername(username)) {
                String query = "INSERT INTO `users` (`username`, `password`)"
                        + "VALUES('" + username + "','" + password + "')";
                statement = koneksi.createStatement();
                statement.executeUpdate(query);
                System.out.println("Input Succsess");
                JOptionPane.showMessageDialog(null, "Register Success");
            }
            else{
                JOptionPane.showMessageDialog(null, "Username Already Used");
            }
        }catch (Exception ex) {
            System.out.println("Input Failed");
        }
    }

    boolean checkUsername (String username){
        try {
            String query = "SELECT * FROM `users` WHERE username = '"+username+"'";
            statement = koneksi.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while(resultSet.next()){
                data[0] = resultSet.getString("username");
            }
            statement.close();
            data[0].toString();
            return true;
        }catch (Exception e){
            return false;
        }
    }


    boolean checkLogin (String username, String password){
        try {
            String query = "SELECT * FROM `users` WHERE username='"+username+"'";
            statement = koneksi.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                data[0] = resultSet.getString("username");
                data[1] = resultSet.getString("password");
            }
            statement.close();
            return data[1].equals(password);
        }catch (Exception e){
            System.out.println("Not Found");
            return false;
        }
    }
}
