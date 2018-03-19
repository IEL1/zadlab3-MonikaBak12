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
public class zadanie34 {
    public static int fib(int n){
        if ((n==1)||(n==2))
        return 1;
        else{
            return fib(n-1)+fib(n-2);
                
                }

    }
    public static void main(String[] args){
            int n;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj, który wyraz ciągu Fibonacciego obliczyć?");
            n = scanner.nextInt();
            System.out.println(n+"-ty wyraz ciągu Fibonacciego: "+fib(n));
        }
    
}
