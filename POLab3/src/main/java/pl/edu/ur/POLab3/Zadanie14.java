/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.POLab3;

/**
 *
 * @author Monika
 */
public class Zadanie14 {
     public static void main(String[] args){
        int x = 7;
        System.out.println("x przed przesunięciem równa się: "+x);
        int y = x >> 2;
        System.out.println("x po przesunięciu o 2 bity w prawo równa się :"+y);
        int z = x << 3;
        System.out.println("x po przesunięciu o 3 bity w lewo równa się:"+z);
        int w = x >>> 1;
        System.out.println("x po przesunięciu o 1 bit w prawo bez znaku:"+w);
    }
    
}
