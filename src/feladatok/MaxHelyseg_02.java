/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package feladatok;

import java.util.Random;
import java.util.Scanner;


public class MaxHelyseg_02 {
    static Random rnd = new Random();
    static Scanner sc = new Scanner(System.in, "latin2");
    public static void main(String[] args) {
        System.out.print("Hány helység lesz: ");
        final int DB = sc.nextInt();
        String[] helysegek = new String[DB];
        sc.nextLine();
        for (int i = 0; i < DB; i++){
            System.out.print("helység neve: ");
            helysegek[i] = sc.nextLine();          
        }
        int[] letszamok = new int[DB];
        for (int i = 0; i < DB; i++){
            letszamok[i] = rnd.nextInt(850, 1_238);
        }
       for (int i = 0; i < DB; i++){
            System.out.println(helysegek[i]+" "+letszamok[i]);
        }
       // Melyik helységben vannak a legtöbben:
       int maxDB = 0;
       for (int i = 0; i < DB; i++){
           if(letszamok[i] > letszamok[maxDB]){
            maxDB = i;   
           } 
        }
       String helys = helysegek[maxDB];
       int letsz = letszamok[maxDB];
        System.out.printf("A(z) %s rendelkezik a legtöbb lakossal (%d)",helys, letsz);
        
        System.out.print("Van-e pontosan 1000 fős helység: ");
        int i = 0;
        while(i < DB && !(letszamok[i] == 1000)){
            i++;
        }
        if(i < DB){
            System.out.println("Van");
        }
        else{
            System.out.println("Nincs");
        }
        
        System.out.println("Minden létszám > 1000: ");
        i = 0;
        while(i < DB && letszamok[i] > 1000){
            i++;
        }
        if(i >= DB){
            System.out.println("igen");
        }
        else{
            System.out.println("nem");
        }
            
    }
}
