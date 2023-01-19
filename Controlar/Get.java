package Controlar;

import Facebook_dao.Facebook_dao;

import java.sql.SQLException;

public class Get {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Facebook_dao f1 =new Facebook_dao();
        f1.get();
    }
}
