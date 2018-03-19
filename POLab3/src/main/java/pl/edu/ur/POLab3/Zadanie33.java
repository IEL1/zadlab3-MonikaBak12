/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.POLab3;

import java.util.Scanner;

/**
 *
 * @author Monika
 */
//ITERACYJNA
public class Zadanie33 {
     public static double potega(double x, int n){
        double w = 1;
       while (n>0)
        {
            //if(n%2 == 1){
            //    w *= x;}
          
            w *= x;
            
            n -= 1;
           
             
                    
            
        }
       
        return w;
    }
    public static void main(String[] args){
        int n;
        int x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj podstawę: ");
        x = scanner.nextInt();
        System.out.println("Podaj wykładnik: ");
        n = scanner.nextInt();
        System.out.println(x + "^" + n + "=" + potega(x,n));
    }
    
}
