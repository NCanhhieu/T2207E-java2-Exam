/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java2exam;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class contactmap {
      HashMap<String,String> hm;

    public contactmap() {
       hm = new HashMap<String,String>();
    }
     
     public boolean Add(){
         contact phone = new contact();
         phone.input();
        if(phone.name.equals("") || phone.number.equals("")){
            return false;
        }
        if(hm.containsKey(phone.number)){//nếu số  đã có
            return false;
        }
        hm.put(phone.number, phone.name);
        return true;
    }
    public void Display(){
           if (hm.isEmpty()) {
            System.out.println("list is emty");
            return;
        }
        System.out.format("\n%-25s       %-15s", "Contact Name", "Phone Number");
     System.out.format("\n%-25s       %-15s", "---------------------", "---------------");
        for(String ta:hm.keySet())
        {
            String tv = hm.get(ta);
            System.out.format("\n%-25s       %-15s", tv,ta);
            
        }
    }
    public void find(){ 
         if (hm.isEmpty()) {
            System.out.println("list is emty");
            return;
        }
        Scanner sc = new Scanner(System.in);
        String name;
        
        System.out.print("input  name to find phone: ");
        name = sc.nextLine();
      int count = 0;
        Iterator itr = hm.keySet().iterator();
    while(itr.hasNext()){ 
        String phonef = (String)itr.next();
        String namef = hm.get(phonef);
        if(namef.indexOf(name) != -1){
            count ++;
            contact ct = new contact(namef,phonef);
            ct.Display();
        }   
        }
        if (count == 0) {
            System.out.println("not found");
        } 
         
    }
 
}
