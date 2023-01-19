package Facebook_dao;

import Facebook_dto.Facebook;
import com.mysql.cj.jdbc.ConnectionImpl;

import java.sql.*;

public class Facebook_dao {

    static String url = "jdbc:mysql://localhost:3306/projects";
    static String us = "root";
    static String pass = "Deadpool6";

    public Facebook in(Facebook f1) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c1 = DriverManager.getConnection(url, us, pass);
            PreparedStatement p1 = c1.prepareStatement("insert into facebook values(?,?,?)");
            p1.setInt(1, f1.getId());
            p1.setString(2, f1.getUsername());
            p1.setString(3, f1.getPassword());
            p1.execute();
            p1.close();
            c1.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return f1;
    }

    public Facebook upda(Facebook f2) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c1 = DriverManager.getConnection(url, us, pass);
            PreparedStatement p1 = c1.prepareStatement("update facebook set username=?,password=? where id=?");
            p1.setInt(1, f2.getId());
            p1.setString(2, f2.getUsername());
            p1.setString(3, f2.getPassword());
            p1.executeUpdate();

            p1.close();
            c1.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return f2;

    }

    public Facebook del(Facebook f4) {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c1 = DriverManager.getConnection(url, us, pass);
            PreparedStatement p1 = c1.prepareStatement("delete from facebook where id=?");
            p1.setInt(1, f4.getId());
            p1.executeUpdate();
            p1.close();
            c1.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return f4;


    }

    public void get() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection c1 = DriverManager.getConnection(url, us, pass);
        Statement s1 = c1.createStatement();
        ResultSet re = s1.executeQuery("select * from facebook");
        while (re.next()) {
            System.out.println("id is  " + re.getInt(1));
            System.out.println("usrename is " + re.getString(2));
            System.out.println("passowd is " + re.getString(3));

        }

    }

        public Facebook changpass(Facebook ch) throws ClassNotFoundException, SQLException {
             Class.forName("com.mysql.cj.jdbc.Driver");

                Connection c1 =DriverManager.getConnection(url,us,pass);
                PreparedStatement p1 = c1.prepareStatement("update facebook set password=? where username=?,id=?");
               p1.setInt(1,ch.getId());
               p1.setString(2,ch.getUsername());

                p1.setString(3,ch.getPassword());
               p1.executeUpdate();
               p1.close();
               c1.close();

            return ch;
        }
    }


