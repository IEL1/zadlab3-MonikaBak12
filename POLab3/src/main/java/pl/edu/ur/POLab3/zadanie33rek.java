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
//REKURENCYJNA
public class zadanie33rek {
     public static double potega(double x, double n) {
    if (n == 0)
    return 1;
        if(n%2 == 1)
        return potega(x, n - 1) * x;
        else{
            double y = potega(x, n/2);
            return y*y;
        }
    }
    
    public static void main(String[] args) {
    int x;
    int n;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj podstawę:");
    x = scanner.nextInt();
    System.out.println("Podaj wykładnik:");
    n = scanner.nextInt();
    System.out.println(x + "^" + n + "=" +potega(x,n));
    
    }
}
