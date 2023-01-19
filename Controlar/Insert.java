package Controlar;

import Facebook_dao.Facebook_dao;
import Facebook_dto.Facebook;

import java.util.Scanner;

public class Insert {
    public static void main(String[] args) {
         Facebook f2 = new Facebook();
        System.out.println("enter the Facebook Data");
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the id");
        f2.setId(sc.nextInt());
        System.out.println("enter the Username");
        f2.setUsername(sc.next());
        System.out.println("enter the password");
        f2.setPassword(sc.next());
        System.out.println("data is Saved");
        Facebook_dao f3 = new Facebook_dao();
        f3.in(f2);
    }
}
