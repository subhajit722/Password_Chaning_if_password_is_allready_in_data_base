package Controlar;

import Facebook_dao.Facebook_dao;
import Facebook_dto.Facebook;

import java.util.Scanner;

public class Updat {
    public static void main(String[] args) {
        Facebook f5 = new Facebook();
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the id");
        f5.setId(sc.nextInt());
        System.out.println("enter the user name");
        f5.setUsername(sc.next());
        System.out.println("enter the password");
        f5.setPassword(sc.next());
    }
}
