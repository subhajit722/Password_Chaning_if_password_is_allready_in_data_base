package Controlar;

import Facebook_dao.Facebook_dao;
import Facebook_dto.Dsd;
import Facebook_dto.Facebook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Changpass {
    static String url = "jdbc:mysql://localhost:3306/projects";
    static String us = "root";
    static String pass = "Deadpool6";

    public Dsd changpass(Dsd ch,String y) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection c1 =DriverManager.getConnection(url,us,pass);
        PreparedStatement p1 = c1.prepareStatement("update facebook set password=? where username="+y);


        p1.setString(1,ch.getPassword());
        p1.executeUpdate();
        p1.close();
        c1.close();


        return ch;
    }
}
