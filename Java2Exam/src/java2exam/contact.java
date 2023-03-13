/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java2exam;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class contact {
      String name;
    String number;

    public contact() {
    }

    public contact(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("input name: ");
        name = sc.nextLine();
        System.out.print("input phone contact:");
        number = sc.nextLine();
    }

   public void Display(){
   System.out.format("\n%-25s       %-15s", this.name, this.number);
}
    
    
}
