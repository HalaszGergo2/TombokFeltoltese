/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package feladatok;

import java.util.Random;


public class Paratlanok_03 {
    static Random rnd = new Random();
    public static void main(String[] args) {
        final int DB = (int) (Math.random()*(25-15+1)+15);
        int[] paratlanok = new int[DB];
        // feltöltés:
           for (int i = 0; i < DB; i++){
               int szam = (int) (Math.random()*(100-11+1)+11);
               if(szam % 2 == 0){
                   //szam--;
                   szam++;
               }
               paratlanok[i] = szam;
           }
        
           paratlanok[(int)(Math.random()*paratlanok.length)]++;
        
        // kiírás: 
        for (int i = 0; i < DB; i++){
            System.out.print(paratlanok[i] + " ");
        }
        System.out.println("");
        
        
        // kiválasztás
        int i = 0;
        while(!(paratlanok[i] % 2 == 0)){
            i++;
        }
        System.out.println("páros elem: " + paratlanok[i]);
    }
}
