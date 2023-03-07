/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.somainfinitosnumeros;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class SomaInfinitosNumeros {

    public static void main(String[] args) {
        int n, soma=0;
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Informe quantos números você deseja somar: ");
        n = entrada.nextInt();
        int a[] = new int [n];
        
        System.out.printf("Informe os " +n+ "números: ");
        for (int i =0; i<n; i++) {
            
            System.out.println("Informe o " + (i+1) +" numero: ");
            a[i]=entrada.nextInt();
        }
        for (int i=0; i<n; i++) {
             soma += (a[i]);
        }
       System.out.println("O resultado da soma dos " +n+ " numeros é: " +soma );
        
        
    }
}
