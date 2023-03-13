/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java2exam;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class main {

    public static int inputInt() {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while (true) {
            try {
                String str = sc.nextLine();
                n = Integer.parseInt(str);
                break;
            } catch (Exception e) {
                System.out.println("nhập số nguyên");
            }
        }
        return n;
    }

    public static int menu() {
        int chon;
        System.out.println("\n-------    Menu    -------");
        System.out.println("-----------------------------");
        System.out.println("------Pick one Option--------");
        System.out.println("-----1.Add new Contact-------");
        System.out.println("-----2.Find contact by Name--");
        System.out.println("-----3.Display all Contact---");
        System.out.println("------4.Exit-----------------");
        chon = inputInt();
        return chon;
    }

    public static void main(String[] args) {
        contactmap stm = new contactmap();
        int chon;
        do {
            chon = menu();
            //xử lý chọn 
            switch (chon) {
                case 1:
                    System.out.println("add a new contact");
                    stm.Add();
                    break;
                case 2:
                    stm.find();
                    break;
                case 3:
                    System.out.println("       Addressbook");
                    stm.Display();
                    break;
                case 4:
                    System.out.println("exit");
                    break;
                default:
                    break;
            }
        } while (chon != 4);
    }
 

}
