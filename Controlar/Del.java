package Controlar;

import Facebook_dao.Facebook_dao;
import Facebook_dto.Facebook;

import java.util.Scanner;

public class Del {
    public static void main(String[] args) {
         Facebook f2 =new Facebook();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter delete id valu");
        f2.setId(sc.nextInt());
        Facebook_dao f6= new Facebook_dao();
        f6.del(f2);
    }
}
