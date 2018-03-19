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
public class zadanie17 {
    public static void main(String[] args){
        boolean x = false;
        boolean y = true;
        boolean a = false;
        boolean b = true;
        System.out.println("x  przyjmuje wartość: "+x);
        System.out.println("y przyjmuje wartość: "+y);
        System.out.println("a przyjmuje wartość:"+a);
        System.out.println("b przyjmuje wartość: "+b);
        boolean z = x ^ y;
        boolean p = x ^ a;
        boolean k = y ^ b;
        System.out.println(" x XOR y równa się: "+z);
        System.out.println(" x XOR a równa się: "+p);
        System.out.println(" y XOR b równa się: "+k);
        boolean w = !x;
        boolean t = !y;
        System.out.println(" NOT X równa się: "+w);
        System.out.println("NOT y równa się: "+t);
        boolean q = !z;
        System.out.println("NOT x XOR y równa się: "+z);
        
        
    }
}
