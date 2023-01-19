package Facebook_dao;

import Controlar.Changpass;
import Exsepion.Username;
import Facebook_dto.Dsd;
import Facebook_dto.Facebook;

import java.sql.*;
import java.util.Scanner;

public class Checkoldpass {
    static String url = "jdbc:mysql://localhost:3306/projects";
    static String us = "root";
    static String pass = "Deadpool6";
    static String uf;


    public String chhek(String x) throws SQLException, ClassNotFoundException, Username {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the user name");
        String user = sc.next();
        uf = "'" + user + "'";


        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection c1 = DriverManager.getConnection(url, us, pass);
        Statement s1 = c1.createStatement();
        int count = 0;
        try {


            ResultSet re = s1.executeQuery("select * from facebook where username=" + uf);
            while (re.next()) {

                x = re.getString(3);
                count++;
            }
            throw new Username("user name not match");

        } catch (Username u) {
        }
        if (count == 0) {
            System.out.println("USER NAME NOT FIND");
            System.exit(505);

        }
        return x;
    }


    public static void main(String[] args) throws SQLException, ClassNotFoundException, Username {
        String old = "";
        Dsd d1 = new Dsd();
        String newpass;
        String od_pass = null;
        Scanner sc = new Scanner(System.in);

        System.out.println("CHANGE YOUR PASSWORD");
        System.out.println("PERSS YES TO CONTUNIE");
        String con = sc.next();
        if (con .equals("yes")) {


            Checkoldpass cv = new Checkoldpass();


            od_pass = cv.chhek(old);


            System.out.println("enter old password");

            String match = sc.next();


            if (od_pass.equals(match)) {

                System.out.println("enter the new password");
                d1.setPassword(sc.next());


                Changpass c7 = new Changpass();
                c7.changpass(d1, uf);


            } else {
                System.out.println("pass word did not match");
                System.exit(404);

            }

            System.out.println("PASSWORD UDDATED SUCEFULLY");


        }else {
            System.out.println("go BACK");
            System.exit(121);

        }
    }
}




